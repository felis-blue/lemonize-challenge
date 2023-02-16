package controllers;

import java.util.Optional;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import model.Yarn;

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

    /**
     * The yarn list
     *
     * @return the list of yarn as JSON
     */
    public Result list() {
        return ok(Json.toJson(Yarn.getAll()));
    }

    /**
     * A yarn item
     *
     * @param id
     *           the id of the requested item
     * @return the yarn item with the given id as JSON
     */
    public Result item(final String id) {
        Optional<Yarn> yarn = Yarn.getById(id);
        return yarn.map(y -> ok(Json.toJson(y))).orElse(notFound("No such id"));
    }
}
