package paper;

import evaluator.Evaluator;

public class Paper {
	
		public String submit()
		{
		 Evaluator evaluator=Evaluator.getEvaluator();
		 String str = evaluator.evaluate(new Paper());
		 //System.out.println("from submit "+str);
		 return str;
		}

}
