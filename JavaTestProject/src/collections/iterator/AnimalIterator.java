package collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class AnimalIterator<String> implements Iterator<Object> {
	 
	  private ArrayList<?> animal;
	  private int position;
	 
	  public AnimalIterator(Animal animalBase) {
	    this.animal = animalBase.getAnimal();
	  }
	 
	  public boolean hasNext() {
	    if (position < animal.size())
	      return true;
	    else
	      return false;
	  }
	 
	  public Object next() {
	    Object aniObj = animal.get(position);
	    position++;
	    return aniObj;
	  }
	 
	  public void remove() {
	    animal.remove(position);
	  }
	 
	}