package com.labManual.ques6.b;
class ageException extends Exception
{float age;
	ageException(float age)
	{
		super("not a valid date");
		this.age=age;
	}
	@Override
	public String toString() {
		return "ageException [age=" + age + "+ is less than 15]";
	}
	
}
public class Person
{
	public String name;
	public float age;
	public Person(String name, float age){
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public void method() 
	{
		try {
			if(age<(float)15)
			{
				throw new ageException(age);
			}
		}
			catch(ageException e)
			{
				System.out.println(e);
				System.out.println(e.getMessage());
			}
			finally
			{
				System.out.println("method finally");
			}
		}
	}
	
