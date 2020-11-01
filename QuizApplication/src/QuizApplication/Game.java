package QuizApplication;

public class Game {
	Question[] questions=new Question[3];
	Player player=new Player();
	
	public void initGame()
	{
		//ceated five objects
		for(int i=0;i<3;i++) {
			questions[i]=new Question();
		}
		//applying values to the variables of the object
		
		questions[0].questions="who is the strangest Avenger?";
		questions[0].option1="Ironman";
		questions[0].option2="Thor";
		questions[0].option1="Hulk";
		questions[0].option1="Scarlet witch";
		questions[0].option1="ironman";
		questions[0].correctAnswer=2;
		

		questions[1].questions="what is the closest planet to sun?";
		questions[1].option1="Earth";
		questions[1].option2="Venus";
		questions[1].option3="Mercury";
		questions[1].option4="Jupiter";
		questions[1].correctAnswer=3;
		
		

		questions[2].questions="what is the capital of austrailia ?";
		questions[2].option1="sydney";
		questions[2].option2="melbourne";
		questions[2].option3="perth";
		questions[2].option4="canberra";
		questions[2].correctAnswer=4;
		
		
	}

	public void play() {
		
		
		player.getDetails();
		
		for(int i=0;i<3;i++) {

			boolean status=questions[i].askQuestion();
			if(status==true) {
				System.out.println("Bahot hi unda khele hai aap!!");
				
				player.score=player.score+5;
			}else {
				System.out.println("Maaf karna mai aapki sahayta nahi kar sakta");
				
				player.score=player.score-5;
			}
		}
		System.out.println("player.name +");
		System.out.println("your score is " +player.score);
				
	}
}
