package eci.arsw.covidanalyzer.model;

public class Result {
	public String id;
	public String nombre;
	public ResultType resultType;
	
	public Result(String idPerson, String nombre,ResultType resultType) {
		this.id = idPerson;
		this.resultType = resultType;
	}
	public String getName() {
		return nombre;}

	public void setName(String nombre) {
		this.nombre = nombre;}

	public String getId() {
		return id;}

	public void setId(String id) {
		this.id = id;}

	public ResultType getResultType() {
		return resultType;}

	public void setResultType(ResultType Type) {
		this.resultType = Type;}
	
	
}