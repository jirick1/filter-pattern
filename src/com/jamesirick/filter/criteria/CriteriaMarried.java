package com.jamesirick.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import com.jamesirick.filter.MaritalStatus;
import com.jamesirick.filter.Person;


public class CriteriaMarried implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> marriedPersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getMaritalStatus() == MaritalStatus.MARRIED) {
				marriedPersons.add(person);
			}
		}
		return marriedPersons;
	}
}
