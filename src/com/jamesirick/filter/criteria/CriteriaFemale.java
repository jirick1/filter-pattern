package com.jamesirick.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import com.jamesirick.filter.Gender;
import com.jamesirick.filter.Person;

public class CriteriaFemale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		
		for(Person person : persons) {
			if (person.getGender() == Gender.FEMALE) {
				femalePersons.add(person);
			}
		}
		return femalePersons;
	}

}
