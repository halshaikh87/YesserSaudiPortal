package sa.gov.yesser.saudi.portal.business.common.dto;

import java.sql.Date;

/**
 * @author Mohammed Ali-SBM 
 * TODO re-checked these attibutes (by mohamed ali ibrahim) 
 * import sa.gov.yesser.to.user.management.RegisteredUserInfoTO;
import sa.gov.yesser.to.user.management.UserTO;*/

public class YesserUser {

	private String userId;// userid
	private String firstName;// first name
	private String middleName;
	private String lastName;// last name
	private String userPassword;
	private String gender;
	private String email;
	private String birthDate;
	private String preferredLanguage;
	private String telephoneNumber;
	private String mobile;
	private String identificationNumber;
	private String registrationType;
	private String interest;
	private String nationality;
	private String country;
	private String province;
	private String city;
	private String postalAddress;//PO Box
	private String postalCode;//ZIP code
	private String homePostalAddress;//Address
	private String securityQuestion;
	private String securityQuestionAnswer;
	private String title;
	private String iqamaExpirationDate;
	private String birthDateType;
	private String preferredNotificationChannel;
	private String isActive;
	private String isVerified;
	private String distinguishedName ="";
	private Date creationDate;
	private Date activationDate;
	
	
	public String getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}
	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(Date activationDate) {
		this.activationDate = activationDate;
	}

	/**
	 * @author Mohammed Ali-SBM
	 * TODO 
	 * Methods to be re implemented and re-checked 
	 * 
	 * public void setUserAttributes(Map<String,Object> attributes) {
			
		userId= attributes.get(IPumaUtils.MANDATORY_ATTRIBUTE_UID)!=null ? (String) attributes.get(IPumaUtils.MANDATORY_ATTRIBUTE_UID) :"";
		firstName= attributes.get(IPumaUtils.MANDATORY_ATTRIBUTE_CN)!=null ? (String) attributes.get(IPumaUtils.MANDATORY_ATTRIBUTE_CN) :"";
		lastName= attributes.get(IPumaUtils.MANDATORY_ATTRIBUTE_SN)!=null ? (String) attributes.get(IPumaUtils.MANDATORY_ATTRIBUTE_SN) :"";
		userPassword= attributes.get(IPumaUtils.ATTRIBUTE_PASSWORD)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_PASSWORD) :"";
			
		email= attributes.get(IPumaUtils.ATTRIBUTE_EMAIL)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_EMAIL) :"";
		isActive= attributes.get(IPumaUtils.ATTRIBUTE_IS_ACTIVE)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_IS_ACTIVE) :"";
		preferredLanguage= attributes.get(IPumaUtils.ATTRIBUTE_PREFERRED_LANGUAGE)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_PREFERRED_LANGUAGE) :"";
			
		telephoneNumber= (attributes.get(IPumaUtils.ATTRIBUTE_TELEPHONE_NUMBER)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_TELEPHONE_NUMBER)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_TELEPHONE_NUMBER)).get(0) :"";
		postalAddress= (attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_ADDRESS)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_ADDRESS)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_ADDRESS)).get(0) :"";
		title= (attributes.get(IPumaUtils.ATTRIBUTE_TITLE)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_TITLE)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_TITLE)).get(0) :"";
		mobile= (attributes.get(IPumaUtils.ATTRIBUTE_MOBILE)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_MOBILE)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_MOBILE)).get(0) :"";
		postalCode= (attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_CODE)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_CODE)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_CODE)).get(0) :"";
		homePostalAddress= (attributes.get(IPumaUtils.ATTRIBUTE_HOME_POSTAL_ADDRESS)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_POSTAL_CODE)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_HOME_POSTAL_ADDRESS)).get(0) :"";
		
		securityQuestion= attributes.get(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION) :"";
		securityQuestionAnswer= attributes.get(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION_ANSWER)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION_ANSWER) :"";
		middleName= attributes.get(IPumaUtils.ATTRIBUTE_MIDDLE_NAME)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_MIDDLE_NAME) :"";
		iqamaExpirationDate = attributes.get(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE) :"";
//		iqamaExpirationDateGergorian= attributes.get(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE_GERGORIAN)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE_GERGORIAN) :"";
		
		birthDate = attributes.get(IPumaUtils.ATTRIBUTE_BIRTH_DATE)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_BIRTH_DATE) :"";
//		birthDateGergorian =attributes.get(IPumaUtils.ATTRIBUTE_BIRTH_DATE_GERGORIAN)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_BIRTH_DATE_GERGORIAN) :"";
		preferredNotificationChannel =attributes.get(IPumaUtils.ATTRIBUTE_PREFERRED_NOTIFICATION_CHANNEL)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_PREFERRED_NOTIFICATION_CHANNEL) :"";
	
		registrationType =attributes.get(IPumaUtils.ATTRIBUTE_REGISTRATION_TYPE)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_REGISTRATION_TYPE) :"";
		interest =attributes.get(IPumaUtils.ATTRIBUTE_INTEREST)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_INTEREST) :"";
		nationality =attributes.get(IPumaUtils.ATTRIBUTE_NATIONALITY)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_NATIONALITY) :"";
		province =attributes.get(IPumaUtils.ATTRIBUTE_PROVINCE)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_PROVINCE) :"";
		identificationNumber =attributes.get(IPumaUtils.ATTRIBUTE_NATIONAL_ID)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_NATIONAL_ID) :"";
		country =attributes.get(IPumaUtils.ATTRIBUTE_COUNTRY)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_COUNTRY) :"";
		//city =attributes.get(IPumaUtils.ATTRIBUTE_CITY)!=null ? (String) attributes.get(IPumaUtils.ATTRIBUTE_CITY) :"";
		city = (attributes.get(IPumaUtils.ATTRIBUTE_CITY)!=null && (((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_CITY)).size()!=0)) ? ((List<String>)attributes.get(IPumaUtils.ATTRIBUTE_CITY)).get(0) :"";
		
		gender = attributes.get(IPumaUtils.ATTRIBUTE_GENDER)!=null ? (String)attributes.get(IPumaUtils.ATTRIBUTE_GENDER) :"0";
		birthDateType = attributes.get(IPumaUtils.ATTRIBUTE_BIRTH_DATE_TYPE)!=null ? (String)attributes.get(IPumaUtils.ATTRIBUTE_BIRTH_DATE_TYPE) :"0";
		if(attributes.get("creatTime")!=null){
			String date=(String) attributes.get("creatTime");
			try{
			Date creat=new Date(Integer.valueOf(date.substring(0, 4))-1900, Integer.valueOf(date.substring(4, 6))-1, Integer.valueOf(date.substring(6, 8)));
			creationDate=creat;
			}catch (Exception e) {}
			} 


	}

	public Map<String,Object> getUserAttributes() {

		HashMap<String,Object> userAttrs = new HashMap<String,Object>();

		userAttrs.put(IPumaUtils.MANDATORY_ATTRIBUTE_UID, userId.toLowerCase());
		userAttrs.put(IPumaUtils.MANDATORY_ATTRIBUTE_CN, firstName);
		userAttrs.put(IPumaUtils.MANDATORY_ATTRIBUTE_SN, lastName);
		userAttrs.put(IPumaUtils.ATTRIBUTE_PASSWORD, userPassword);
		userAttrs.put(IPumaUtils.ATTRIBUTE_EMAIL, email.toLowerCase());
		userAttrs.put(IPumaUtils.ATTRIBUTE_IS_ACTIVE, isActive);
		userAttrs.put(IPumaUtils.ATTRIBUTE_PREFERRED_LANGUAGE,
				preferredLanguage);
		userAttrs.put(IPumaUtils.ATTRIBUTE_TELEPHONE_NUMBER, telephoneNumber);
		userAttrs.put(IPumaUtils.ATTRIBUTE_POSTAL_ADDRESS, postalAddress);
		userAttrs.put(IPumaUtils.ATTRIBUTE_TITLE, title);
		userAttrs.put(IPumaUtils.ATTRIBUTE_MOBILE, mobile);
		userAttrs.put(IPumaUtils.ATTRIBUTE_POSTAL_CODE, postalCode);
		userAttrs.put(IPumaUtils.ATTRIBUTE_HOME_POSTAL_ADDRESS,
				homePostalAddress);
		userAttrs.put(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION, securityQuestion);
		userAttrs.put(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION_ANSWER,
				securityQuestionAnswer);
		userAttrs.put(IPumaUtils.ATTRIBUTE_MIDDLE_NAME, middleName);
		userAttrs.put(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE,
				iqamaExpirationDate);
//		userAttrs.put(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE_GERGORIAN,
//				iqamaExpirationDateGergorian);
		userAttrs.put(IPumaUtils.ATTRIBUTE_BIRTH_DATE, birthDate);
//		userAttrs.put(IPumaUtils.ATTRIBUTE_BIRTH_DATE_GERGORIAN,
//				birthDateGergorian);
		userAttrs.put(IPumaUtils.ATTRIBUTE_PREFERRED_NOTIFICATION_CHANNEL,
				preferredNotificationChannel);
		userAttrs.put(IPumaUtils.ATTRIBUTE_REGISTRATION_TYPE, registrationType);
		userAttrs.put(IPumaUtils.ATTRIBUTE_INTEREST, interest);
		userAttrs.put(IPumaUtils.ATTRIBUTE_NATIONALITY, nationality);
		userAttrs.put(IPumaUtils.ATTRIBUTE_PROVINCE, province);
		userAttrs.put(IPumaUtils.ATTRIBUTE_NATIONAL_ID, identificationNumber);
		userAttrs.put(IPumaUtils.ATTRIBUTE_COUNTRY, country);
		userAttrs.put(IPumaUtils.ATTRIBUTE_CITY, city);
		userAttrs.put(IPumaUtils.ATTRIBUTE_GENDER, new String(""+gender));
		userAttrs.put(IPumaUtils.ATTRIBUTE_BIRTH_DATE_TYPE, birthDateType);

		return userAttrs;
	}

	public List<String> getUserAttributeNames() {
		List<String> userAttributeNames = new ArrayList<String>();
		userAttributeNames.add(IPumaUtils.MANDATORY_ATTRIBUTE_UID);
		userAttributeNames.add(IPumaUtils.MANDATORY_ATTRIBUTE_CN);
		userAttributeNames.add(IPumaUtils.MANDATORY_ATTRIBUTE_SN);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_PASSWORD);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_EMAIL);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_IS_ACTIVE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_PREFERRED_LANGUAGE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_TELEPHONE_NUMBER);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_POSTAL_ADDRESS);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_TITLE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_MOBILE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_POSTAL_CODE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_HOME_POSTAL_ADDRESS);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_SECURITY_QUESTION_ANSWER);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_MIDDLE_NAME);
		userAttributeNames
				.add(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE);
//		userAttributeNames
//				.add(IPumaUtils.ATTRIBUTE_IQAMA_EXPIRATION_DATE_GERGORIAN);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_BIRTH_DATE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_BIRTH_DATE_GERGORIAN);
		userAttributeNames
				.add(IPumaUtils.ATTRIBUTE_PREFERRED_NOTIFICATION_CHANNEL);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_REGISTRATION_TYPE);

		userAttributeNames.add(IPumaUtils.ATTRIBUTE_INTEREST);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_NATIONALITY);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_PROVINCE);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_NATIONAL_ID);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_COUNTRY);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_CITY);
		userAttributeNames.add(IPumaUtils.ATTRIBUTE_GENDER);

		return userAttributeNames;
	}*/

	public String getUserId() {
		return userId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIdentificationNumber() {
		return identificationNumber;
	}

	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	public String getRegistrationType() {
		return registrationType;
	}

	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getNationality() {
		return nationality;
	}

	public void setBirthDateType(String birthDateType) {
		this.birthDateType = birthDateType;
	}

	public String getBirthDateType() {
		return birthDateType;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getHomePostalAddress() {
		return homePostalAddress;
	}

	public void setHomePostalAddress(String homePostalAddress) {
		this.homePostalAddress = homePostalAddress;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityQuestionAnswer() {
		return securityQuestionAnswer;
	}

	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		this.securityQuestionAnswer = securityQuestionAnswer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPreferredNotificationChannel() {
		return preferredNotificationChannel;
	}

	public void setPreferredNotificationChannel(
			String preferredNotificationChannel) {
		this.preferredNotificationChannel = preferredNotificationChannel;
	}

	public String getDistinguishedName() {
		return distinguishedName;
	}

	public void setDistinguishedName(String distinguishedName) {
		this.distinguishedName = distinguishedName;
	}
	
	/**
	 * @author Mohammed Ali-SBM
	 *  TODO re-check these attibutes 
	 * public UserTO getUserTO(){
		UserTO userTO =new UserTO();
	
		return userTO;
	}*/

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getIqamaExpirationDate() {
		return iqamaExpirationDate;
	}

	public void setIqamaExpirationDate(String iqamaExpirationDate) {
		this.iqamaExpirationDate = iqamaExpirationDate;
	}

	/**
	 *  @author Mohammed Ali-SBM
	 *  TODO re-check these attibutes 
	 * public YesserUser getYesserUser(RegisteredUserInfoTO registeredUserInfoTO){
		YesserUser yesserUser =new YesserUser();
		yesserUser.setUserId(registeredUserInfoTO.getUserId());
		yesserUser.setEmail(registeredUserInfoTO.getEmail());
		
		return yesserUser;
	}*/

}
