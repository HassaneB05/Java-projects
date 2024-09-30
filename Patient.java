public class Patient {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String streetAddress;
	private String city, state;
	private int zipCode;
	private String phoneNumber;
	private String emergencyCName;
	private String emergencyCPhoneNumber;
	
	/**
	 * No-arg Constructor
	 * No parameter
	 */
	
	public Patient() {
		
		firstName = "Patient First Name";
		middleName = "Patient Middle Name";
		lastName = "Patient Last Name";
		streetAddress = "Street Address";
		city = "City";
		state = "State";
		zipCode = 00000;
		phoneNumber = "000-000-0000";
		emergencyCName = "Emergency Contact Name";
		emergencyCPhoneNumber = "000-000-0000";
	}
	
	/**
	 * Constructor
	 * @param firstN The first name of patient
	 * @param middleN The middle name of patient
	 * @param lastN The last name of patient
	 */
	
	public Patient(String firstN, String middleN, String lastN) {
		
		firstName = firstN;
		middleName = middleN;
		lastName = lastN;
	}
	
	/**
	 * Constructor
	 * @param firstN The first name of patient
	 * @param middleN The middle name of patient
	 * @param lastN The last name of patient
	 * @param streetAdd The street address of patient
	 * @param cityP The city of patient
	 * @param stateP The state of patient
	 * @param ZIP The ZIP code of patient
	 * @param phoneN The phone number of patient
	 * @param emergencyN The name of emergency contact of patient
	 * @param emergencyPhone The phone number of emergency contact of patient
	 */
	
	public Patient(String firstN, String middleN, String lastN, 
			String streetAdd, String cityP, String stateP, int ZIP,
			String phoneN, String emergencyN, String emergencyPhone) {
		
		firstName = firstN;
		middleName = middleN;
		lastName = lastN;
		streetAddress = streetAdd;
		city = cityP;
		state = stateP;
		zipCode = ZIP;
		phoneNumber = phoneN;
		emergencyCName = emergencyN;
		emergencyCPhoneNumber = emergencyPhone;
	}
	
	/**
	 * The setFirstName method stores a value in the firstName field
	 * @param firstN the value to store in firstName
	 */
	
	public void setFirstName(String firstN) {
		
		firstName = firstN;
	}
	
	/**
	 * The getFirstName method returns the value stored in firstName
	 * @return firstName
	 */
	
	public String getFirstName() {
		
		return firstName;
	}
	
	/**
	 * The setMiddleName method stores a value in the middleName field
	 * @param middleN
	 */
	
	public void setMiddleName(String middleN) {
		
		middleName = middleN;
	}
	
	/**
	 * The getMiddleName method returns the value stored in middleName
	 * @return middleName
	 */
	
	public String getMiddleName() {
		
		return middleName;
	}
	
	/**
	 * The setLastName method stores a value in the lastName field
	 * @param lastN
	 */
	
	public void setLastName(String lastN) {
		
		lastName = lastN;
	}
	
	/**
	 * The getLastName method returns the value stored in lastName
	 * @return lastName
	 */
	
	public String getLastName() {
		
		return lastName;
	}
	
	/**
	 * The setStreetAddress method stores a value in the streetAddress field
	 * @param streetAdd
	 */
	
	public void setStreetAddress(String streetAdd) {
		
		streetAddress = streetAdd;
	}
	
	/**
	 * The getStreetAddress method returns the value stored in streetAddress
	 * @return streetAddress
	 */
	
	public String getStreetAddress() {
		
		return streetAddress;
	}
	
	/**
	 * The setCity method stores a value in the city field
	 * @param cityP
	 */
	
	public void setCity(String cityP) {
		
		city = cityP;
	}
	
	/**
	 * The getCity method returns the value stored in city
	 */
	
	public String getCity() {
		
		return city;
	}
	
	/**
	 * The setState method stores a value in the state field
	 * @param stateP
	 */
	
	public void setState(String stateP) {
		
		state = stateP;
	}
	
	/**
	 * The getState method return the value stored in state
	 * @return state
	 */
	
	public String getState() {
		
		return state;
	}
	
	/**
	 * The setZipCode method stores a value in the zipCode field
	 * @param ZIP
	 */
	
	public void setZipCode(int ZIP) {
		
		zipCode = ZIP;
	}
	
	/**
	 * The getZipCode method returns the value stored in zipCode
	 * @return zipCode
	 */
	
	public int getZipCode() {
		
		return zipCode;
	}
	
	/**
	 * The setPhoneNumber method stores a value in the phoneNumber field
	 * @param phoneN
	 */
	
	public void setPhoneNumber(String phoneN) {
		
		phoneNumber = phoneN;
	}
	
	/**
	 * The getPhoneNumber method returns the value stored in phoneNumber
	 * @return phoneNumber
	 */
	
	public String getPhoneNumber() {
		
		return phoneNumber;
	}
	
	/**
	 * The setEmergencyContactName method stores a value in the emergencyCName field
	 * @param emergencyN
	 */
	
	public void setEmergencyContactName(String emergencyN) {
		
		emergencyCName = emergencyN;
	}
	
	/**
	 * The getEmergencyContactName method returns the value stored in emergencyCName
	 * @return emergencyCName
	 */
	
	public String getEmergencyContactName() {
		
		return emergencyCName;
	}
	
	/**
	 * The setEmergencyContactPhone method stores a value in the emergencyCPhoneNumber field
	 * @param emergencyPhone
	 */
	
	public void setEmergencyContactPhone(String emergencyPhone) {
		
		emergencyCPhoneNumber = emergencyPhone;
	}
	
	/**
	 * The getEmergencyContactPhone returns the value stored in emergencyCPhoneNumber
	 * @return emergencyCPhoneNumber
	 */
	
	public String getEmergencyContactPhone() {
		
		return emergencyCPhoneNumber;
	}
	
	/**
	 * The buildFullName method returns a String which is the concatenation of first,
	 * middle and last name separated by space
	 */
	
	public String buildFullName() {
		
		return firstName + " " + middleName + " " + lastName;
	}
	
	/**
	 * The buildAddress method returns a String which is the concatenation of address,
	 * city, state and ZIP separated by space
	 */
	
	public String buildAddress() {
		
		return streetAddress + ", " + city + ", " + state + ", " + zipCode;
	}
	
	/**
	 * The buildEmergencyContact method returns a String which is the concatenation of
	 * emergency name and emergency phone separated by space
	 */
	
	public String buildEmergencyContact() {
		
		return emergencyCName + " " + emergencyCPhoneNumber;
	}
	
	/**
	 * The toString method displays all information of a patient
	 */
	
	public String toString() {
		
		return buildFullName() + "\n" + buildAddress() + "\n" + buildEmergencyContact();
	}
	
}
