package Util;

public class AnaCentCalc {

    public static Double calcUmidade(Double pCadinho, Double pAmostra, Double pFinal) {

        return ((pFinal - pCadinho) * 100) / pAmostra;

    }
    
    public static Double calcProteinas(Double pAmostra, Double fatorConexao, Double volume){
        
        return (4 * 6.25 * fatorConexao * 100 * volume) / pAmostra;
        
    }
    
    public static Double calcLipidios(Double pCadinhoVazio, Double pAmostra, Double pFinal){
        
        return (((pFinal - pCadinhoVazio)*4)/pAmostra)*100;
        
    }
    
    public static Double calcFibras(Double pCadinhoVazio, Double pAmostra, Double pFinal){
        
        return ((pCadinhoVazio - pFinal)*100) / pAmostra;
        
    }
    
    public static Double calcCinzas(Double pCadinhoVazio, Double pAmostra, Double pFinal){
        
        return ((pFinal - pCadinhoVazio)*100)/ pAmostra;
        
    }
    
    public static Double calcCarboidratos(Double proteinas, Double fibras, Double lipidios,Double umidade, Double cinzas){
        
        return 100 - (proteinas + fibras + lipidios + umidade + cinzas);
        
    }
    
}
