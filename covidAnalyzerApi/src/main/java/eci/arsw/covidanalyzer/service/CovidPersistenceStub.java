package eci.arsw.covidanalyzer.service;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList; 
import org.springframework.stereotype.Service;
import eci.arsw.covidanalyzer.model.Result;
import eci.arsw.covidanalyzer.model.ResultType;
@Service
public class CovidPersistenceStub implements ICovidAggregateService {
	private final ConcurrentHashMap<ResultType,Result> listaresultados = new ConcurrentHashMap<>();
	List<Result> array;
	
	public CovidPersistenceStub() {
		array =new CopyOnWriteArrayList<>();
		Result r1=new Result("1","Messi",ResultType.TRUE_POSITIVE);
		Result r2=new Result("2","Leonidas",ResultType.FALSE_NEGATIVE);
		Result r3=new Result("3","Figoo",ResultType.TRUE_NEGATIVE);
		Result r4=new Result("4","Aranguis",ResultType.FALSE_POSITIVE);
		
		
		array.add(r1);
		array.add(r2);
		array.add(r3);
		array.add(r4);}

	public boolean aggregateResult(Result result, ResultType type) throws ResultException {
		for (Result elemento:array){
			if(elemento.getId().equals(result.id)){
				throw new ResultException("El usuario ya existe en el sistema");}}
		array.add(result);
		return true;}

	@Override
	public List<Result> getResult(ResultType type) {
		List<Result> restfin=new CopyOnWriteArrayList<>();
		for (Result elemento:array){
			if(elemento.getResultType().equals(type)){
				restfin.add(elemento);}}
		return restfin;}

	@Override
	public void upsertPersonWithMultipleTests(String id, ResultType type) {
		for (Result elemento:array){
			if(elemento.getId().equals(id)){
				elemento.setResultType(type);}}
	}
}

