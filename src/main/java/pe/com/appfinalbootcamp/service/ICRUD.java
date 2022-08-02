package pe.com.appfinalbootcamp.service;

import java.util.List;

public interface ICRUD<M, I> {

	M create(M obj);
	M update(M obj);
	List<M> readAll();
	M read(I id);
	boolean delete(I id);
}
