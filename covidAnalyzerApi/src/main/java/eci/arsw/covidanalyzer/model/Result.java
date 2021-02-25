package eci.arsw.covidanalyzer.model;

public class Result {
	public String id;
	public String nombre;
	public ResultType resultType;
	
	public Result(String idPerson, String name,ResultType resultType) { 
		this.id = idPerson;
		this.resultType = resultType;
		this.nombre = name;
	}
	

	public String getId() {
		return id;}

	public void setId(String id) {
		this.id = id;}

	public ResultType getResultType() {
		return resultType;}

	public void setResultType(ResultType resultType) {
		this.resultType = resultType;}
	
	
}