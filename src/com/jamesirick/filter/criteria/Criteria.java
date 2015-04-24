package com.jamesirick.filter.criteria;

import java.util.List;

import com.jamesirick.filter.Person;

public interface Criteria {
	public List<Person> meetCriteria(List<Person> persons);
}
