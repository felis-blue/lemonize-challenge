package controllers;

import play.mvc.Controller;
import play.mvc.Result;

/**
 * Controller handling the requests for the index page, as well as the yarn list
 * and yarn items
 */
public class MainController extends Controller {

    /**
     * The index page
     *
     * @return the index template rendered to HTML
     */
    public Result index() {
        return ok(views.html.index.render());
    }

}
