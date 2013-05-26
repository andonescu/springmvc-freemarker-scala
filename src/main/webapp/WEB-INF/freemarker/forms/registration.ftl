<@layout.mainLayout title="New Registration">

<form method="post">

	<@tags.formInput form="registrationForm" path="email" />
	<@tags.formInput form="registrationForm" path="password" type="password" />
	<@tags.formInput form="registrationForm" path="passwordConf" type="password" />
	
	<@tags.formInput form="registrationForm" path="lastName" />
	<@tags.formInput form="registrationForm" path="firstName" />
	<@tags.formInput form="registrationForm" path="birthDate" />
	<@tags.formInput form="registrationForm" path="address" />
	<@tags.formInput form="registrationForm" path="city" />
	
	<@tags.formSelect form="registrationForm" path="county" values=dataService.counties />
	
	<@tags.checkbox form="registrationForm" path="agreement"  containerClass="fullWidth"/>
	<br/> 
	<input type="submit" value="Submit"/>
</form>

</@layout.mainLayout>