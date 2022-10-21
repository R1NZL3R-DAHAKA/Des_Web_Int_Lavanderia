package pe.edu.lavanderia.proc.mantenimientos;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.lavanderia.dao.DaoCategorias;
import pe.edu.lavanderia.dto.DtoCategorias;
import pe.edu.lavanderia.entidades.jdbc.Categorias;
import pe.edu.universidad.entidades.jpa.Categoria;

@Stateless
@LocalBean
public class BOGestionCategorias {

    @PersistenceContext(unitName = "Lavanderia-JPA")
    private EntityManager em;

    public BOGestionCategorias() {
    }

    public List<Categorias> getCategorias() {
        DaoCategorias dao = new DaoCategorias();
        return dao.getCategorias();
    }

    public List<Integer> getCodCategorias() {
        DaoCategorias dao = new DaoCategorias();
        return dao.getCodCategorias();
    }

    public void addCategoriaJPA(Categoria ob) {
        em.persist(ob);
    }

    public void addCategoria(Categorias ob) {
        DaoCategorias dao = new DaoCategorias();
        dao.addCategoria(ob);
    }

    public void editCategoria(Categorias ob) {
        DaoCategorias dao = new DaoCategorias();
        dao.editCategoria(ob);
    }

    public void removeCategoria(int cod) {
        DaoCategorias dao = new DaoCategorias();
        dao.remoteCategoria(cod);
    }

    public List<DtoCategorias> getCategoriasDTO() {
        List<DtoCategorias> lstDto = new ArrayList<DtoCategorias>();
        DaoCategorias dao = new DaoCategorias();
        List<Categorias> lst = dao.getCategorias();
        for (Categorias categorias : lst) {
            DtoCategorias dto = new DtoCategorias();
            dto.setCod_categoria(categorias.getCod_categoria());
            dto.setNombre(categorias.getNombre());
            dto.setDescripcion(categorias.getDescripcion());
            lstDto.add(dto);
        }
        return lstDto;
    }

}
