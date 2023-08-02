package kodlama.io.devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguage> languages;
	
	public InMemoryProgrammingLanguageRepository() {
		
		languages = new ArrayList<ProgrammingLanguage>();
		languages.add(new ProgrammingLanguage(0, "C#"));
		languages.add(new ProgrammingLanguage(1, "Java"));
		languages.add(new ProgrammingLanguage(2, "Javascript"));

	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return languages;
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		return languages.get(id);
	}

	@Override
	public ProgrammingLanguage add(ProgrammingLanguage language) {
		languages.add(language);
		return language;
	}

	@Override
	public ProgrammingLanguage delete(ProgrammingLanguage language) {
		languages.remove(language);
		return language;
		
	}

	@Override
	public ProgrammingLanguage update(ProgrammingLanguage language) throws Exception {
		return languages.set(language.getId(), language.setName(language.getName()));
	}	

}




