package com.example.appBack.Student.repositorio.tiporegistro;

import com.example.appBack.Student.Entity.Tiporegistro;
import com.example.appBack.Student.Entity.TiporegistroDTO;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TiporegistroRepositoryImpl {

    @PersistenceContext
    private EntityManager entityManager;

    private CriteriaBuilder cb ;//= entityManager.getCriteriaBuilder();
    private CriteriaQuery<Tiporegistro> query;// = cb.createQuery(Student.class);
    private Root<Tiporegistro> root;// = query.from(Student.class);
    private List<Predicate> predicates;// = new ArrayList<>();


    private void resetQueries() {
        cb = entityManager.getCriteriaBuilder();
        query = cb.createQuery(Tiporegistro.class);
        root = query.from(Tiporegistro.class);
        predicates = new ArrayList<>();
    }

    public List<TiporegistroDTO> getQueryLike(TiporegistroDTO consulta)
    {
        try
        {
            resetQueries();

            ArrayList<Object> datos1 = new ArrayList<>();
            datos1.add(consulta.getName());
            datos1.add(consulta.getLast_update());
            datos1.add(consulta.isActivo());


            ArrayList<String> datos = new ArrayList<>();
            datos.add("name");
            datos.add("last_update");
            datos.add("activo");

            for(int i=0;i<datos.size();i++){
                addLike(datos.get(i), datos1.get(i));
            }

            query.select(root).where(predicates.toArray(new Predicate[predicates.size()]));
            List<Tiporegistro> lista = new ArrayList<>();
            lista.addAll(entityManager.createQuery(query).getResultList());
            return TiporegistroDTO.getAllTipoRegistroDTO(lista);
        }catch (Exception e) {
            System.err.println(e.getMessage()+"");
            return new ArrayList<>();
        }
    }

    private void addLike(String nameColum, Object objeto)
    {
        if(comprobarObjects(objeto)) {
            predicates.add(cb.like(root.get(nameColum),"%"+ objeto.toString() +"%"));
        }
    }

    private boolean comprobarNumbers(Object num)//Number num)
    {
        try
        {
            if(Double.parseDouble(num.toString()) > 0) {
                return true;
            }
        }
        catch (Exception e){e.printStackTrace();}
        return false;
    }

    private boolean comprobarString(String str)
    {
        try {
            if (str.trim().length() != 0) {
                return true;
            }
        }catch (Exception e) {e.printStackTrace(); }
        return false;
    }

    private boolean comprobarObjects(Object objeto)
    {
        try {
            if (objeto != null) {
                if(comprobarString(objeto.toString())){
                    return true;}
                if(comprobarNumbers(objeto)){
                    return true;
                }
                return true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

}

