package io.restapi.notes;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Notes, Integer> {

}
