public class Procedure {

	private String procedureName;
	private String procedureDate;
	private String practitionerName;
	private double chargesOfProcedure;
	
	/**
	 * No-arg constructor
	 * No parameter
	 */
	
	public Procedure() {
		
		procedureName = "Name Of Procedure";
		procedureDate = "MM/DD/YYYY";
		practitionerName = "Name of Practitioner";
		chargesOfProcedure = 00.0;
	}
	
	/**
	 * Constructor
	 * @param procedureN
	 * @param procedureD
	 */
	
	public Procedure(String procedureN, String procedureD) {
		
		procedureName = procedureN;
		procedureDate = procedureD;
	}
	
	/**
	 * Constructor
	 * @param procedureN
	 * @param procedureD
	 * @param practitionerN
	 * @param charges
	 */
	
	public Procedure(String procedureN, String procedureD, 
			         String practitionerN, double charges) {
		
		procedureName = procedureN;
		procedureDate = procedureD;
		practitionerName = practitionerN;
		chargesOfProcedure = charges;
	}
	
	/**
	 * The setProcedureName method stores a value in the procedureName field
	 * @param procedureN
	 */
	
	public void setProcedureName(String procedureN) {
		
		procedureName = procedureN;
	}
	
	/**
	 * The getProcedureName method returns the value stored in procedureName
	 * @return procedureName
	 */
	
	public String getProcedureName() {
		
		return procedureName;
	}
	
	/**
	 * The setProcedureDate method stores a value in the procedureDate field
	 * @param procedureN
	 */
	
	public void setProcedureDate(String procedureD) {
		
		procedureDate = procedureD;
	}
	
	/**
	 * The getProcedureDate method returns the value stored in procedureDate
	 * @return procedureDate
	 */
	
	public String getProcedureDate() {
		
		return procedureDate;
	}
	
	/**
	 * The setPractitionerName method stores a value in the practitionerName field
	 * @param practitionerN
	 */
	
	public void setPractionerName(String practitionerN) { 
		
		practitionerName = practitionerN;
	}
	
	/**
	 * The getPractionerName method returns the value stored in practionerName
	 * @return practitionerName
	 */
	
	public String getPractitionerName() {
		
		return practitionerName;
	}
	
	/**
	 * The setProcedureCharges method stores a value in the chargesOfProcedure field
	 * @param charges
	 */
	
	public void setProcedureCharges(double charges) {
		
		chargesOfProcedure = charges;
	}
	
	/**
	 * The getProcedureCharges method returns the value stored in chargesOfProcedure
	 * @return chargesOfProcedure
	 */
	
	public double getProcedureCharges() {
		
		return chargesOfProcedure;
	}
	
	/**
	 * The toString method displays all information of a procedure
	 */
	
	public String toString() {
		
		return procedureName + "\n" + procedureDate + "\n" + practitionerName + "\n"
				+ chargesOfProcedure;
	}
}