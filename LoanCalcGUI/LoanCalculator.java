import javafx.scene.control.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.geometry.*;


public class LoanCalculator extends Application
{

public void start( Stage myStage )
{
	myStage.setTitle( "Loan Calculator" );
	GridPane rootNode = new GridPane();
	rootNode.setPadding( new Insets( 30 ) );
	rootNode.setHgap( 5 );
	rootNode.setVgap( 5 );
	rootNode.setAlignment( Pos.CENTER );
	
	Scene myScene = new Scene( rootNode, 300, 200 );
	
	rootNode.add( new Label( "Annual Interest Rate:" ), 0, 0 ); rootNode.add( new TextField(), 1, 0 );
	//Label interestRate = new Label( "Annual Interest Rate:" );
	rootNode.add( new Label( "Number of Years:" ), 0, 1 ); rootNode.add( new TextField(), 1, 1 );
	//Label years = new Label( "Number of Years:" );
	rootNode.add( new Label( "Loan Amount:" ), 0, 2 ); rootNode.add( new TextField(), 1, 2 );
	//Label loanAmt = new Label( "Loan Amount:" );
	rootNode.add( new Label( "Monthly Payment:" ), 0, 3 ); rootNode.add( new TextField(), 1, 3 );
	//Label monthlyPay = new Label( "Monthly Payment:" );
	rootNode.add( new Label( "Total Payment:" ), 0, 4 ); rootNode.add( new TextField(), 1, 4 );
	
	//Label totalPay = new Label( "Total Payment:" );
	//TextField interestField = new TextField();
	//TextField yearField = new TextField();
	//TextField loanField = new TextField();
	//TextField monthField = new TextField();
	//TextField totalField = new TextField();
	
	Button calculateButton = new Button( "Calculate" ); rootNode.add( calculateButton, 1, 5 );
	
	//rootNode.getChildren().addAll( interestRate, years, loanAmt, monthlyPay, totalPay, interestField, yearField, loanField, monthField, totalField, calculateButton );
	//rootNode.setHalignment( calculateButton, JPos.RIGHT );
	
	myStage.setScene( myScene );
	myStage.show();
}

public static void main( String [] args )
{
	launch( args );
}

}