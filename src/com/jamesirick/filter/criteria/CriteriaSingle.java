package com.jamesirick.filter.criteria;

import java.util.ArrayList;
import java.util.List;

import com.jamesirick.filter.MaritalStatus;
import com.jamesirick.filter.Person;

public class CriteriaSingle implements Criteria {

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();

		for (Person person : persons) {
			if (person.getMaritalStatus() == MaritalStatus.SINGLE) {
				singlePersons.add(person);
			}
		}
		return singlePersons;
	}
}
