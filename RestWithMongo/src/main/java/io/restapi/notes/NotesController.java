package io.restapi.notes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotesController {
	@Autowired
	private NotesService notesService;
	
	@RequestMapping("/getAllNotes")
	public List<Notes> getAllNotes(){
		return notesService.getAllNotes();
	}
	@RequestMapping("/getNote/{id}")
	public Optional<Notes> getNote(@PathVariable Integer id) {
		return notesService.getNote(id);
	}
	@RequestMapping(method = RequestMethod.POST , value= "/addNote")
	public void addNote(@RequestBody Notes notes) {
		notesService.addNote(notes);
	}
	@RequestMapping(method = RequestMethod.PUT , value= "/updateNote/{id}")
	public void updateNote(@RequestBody Notes notes ,@PathVariable Integer id) {
		notesService.updateNote(notes, id);
	}
	@RequestMapping(method = RequestMethod.DELETE , value= "/delete/{id}")
	public void deleteNote(@PathVariable Integer id) {
		 notesService.deleteNote(id);
	}
}
