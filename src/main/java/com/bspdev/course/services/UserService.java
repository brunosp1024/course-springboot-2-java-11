package com.bspdev.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bspdev.course.entities.User;
import com.bspdev.course.repositories.UserRepository;
import com.bspdev.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired //Automatiza a injeção de dependência entre esta e a classe repository.
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id)); //Chama o get e caso não encontre nenhum objeto com o id informado, a exceção é ativa.
	}
	
	public User insert(User obj) {
		return repository.save(obj); //Por padrão o método .save(obj) retorna o obj.
	}
	
	public void delete(Long Id) {
		repository.deleteById(Id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getOne(id); //Prepara o entity monitorado pra depois efetuar uma operação.
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
