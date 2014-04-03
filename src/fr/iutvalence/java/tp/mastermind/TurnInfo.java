package fr.iutvalence.java.tp.mastermind;

/**
 * Une classe réunissant les informations obtenues lors d'un tour
 * @author vignalfa
 *
 */
public class TurnInfo
{
	/**
	 * un code
	 */
	private final Code code;
	/**
	 * un résultat de comparaison
	 */
	private final ResultOfCodeComparison codeComparison;
	
	/**
	 * initialisation des variables
	 * @param code le code
	 * @param codeComparison le résultat de la comparaison
	 */
	public TurnInfo(Code code,ResultOfCodeComparison codeComparison)
	{
		this.code = code;
		this.codeComparison = codeComparison;
	}
	/**
	 * accesseur au code
	 * @return le code
	 */
	public Code getCode()
	{
		return this.code;
	}
	/**
	 * accesseur au résultat de la comparaison
	 * @return le résultat de la comparaison
	 */
	public ResultOfCodeComparison getCodeComparison()
	{
		return this.codeComparison;
	}
	
}

