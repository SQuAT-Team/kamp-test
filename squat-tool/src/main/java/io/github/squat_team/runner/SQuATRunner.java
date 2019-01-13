package io.github.squat_team.runner;

public class SQuATRunner {

	public static void main(String[] args) {
		SQuATConfiguration configuration = SQuATConfiguration.generateDefault();
		SQuATController controller = new SQuATController(configuration);
		controller.negotiatiateUntilAnAgreementIsReached();
		
		//SQuATSillyBotsNegotiator squat=new SQuATSillyBotsNegotiator();
		////squat.getArchTransFactory().preLoadModelsFrom("/Users/santiagovidal/Documents/Programacion/kamp-test/squat-tool/models/cocomeWithResourceDemands",1);
		//squat.negotiatiateUntilAnAgreementIsReached();
	}

}
