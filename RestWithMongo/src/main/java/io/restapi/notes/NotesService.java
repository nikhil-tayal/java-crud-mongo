package io.restapi.notes;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotesService {
	@Autowired
	private NotesRepository notesRepository;
	
	public List<Notes> getAllNotes(){
		return notesRepository.findAll();
	}
	public Optional<Notes> getNote(Integer id) {
		return notesRepository.findById(id);
	}
	public void addNote(Notes notes) {
		notesRepository.save(notes);		
	}
	public void updateNote(Notes note ,Integer id) {
		notesRepository.save(note);
	}
	public void deleteNote(Integer id) {
		notesRepository.deleteById(id);
	}
	
}
