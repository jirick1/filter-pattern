package com.jamesirick.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import com.jamesirick.filter.Gender;
import com.jamesirick.filter.Person;

public class CriteriaMale implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		
		for(Person person : persons) {
			if (person.getGender() == Gender.MALE) {
				malePersons.add(person);
			}
		}
		return malePersons;
	}
}
