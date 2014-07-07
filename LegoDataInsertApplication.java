package controllers;

import models.Message;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import com.lookcapp.mpaper.lego.businesslogic.LegoHtmlParsing;
 

public class LegoDataInsertApplication extends Controller {
	
	//Action
	public static Result add(){
		Form<Message> f = new Form(Message.class);
		return ok(add.render("LEGO DATA INSERT",f));
	}

//	// /create Action
//	public static Result create(){
////		Form<Message> f = new Form(Message.class).bindFromRequest();
////		if (!f.hasErrors()){
////			Message data = f.get();
////			data.save();
//			return redirect("/");
////		} else {
////			return badRequest(add.render("ERROR", f));
////		}
//	}
    
	//LEGO DATA INSERT
	public static Result legoDataInsert(){
		LegoHtmlParsing.main(null);
		return redirect("/");
	}

}