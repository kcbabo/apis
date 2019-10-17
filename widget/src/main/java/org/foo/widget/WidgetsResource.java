package org.foo.widget;

import java.lang.String;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.foo.widget.beans.Widget;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/widgets")
public interface WidgetsResource {
  /**
   * Gets a list of all `Widget` entities.
   */
  @GET
  List<Widget> getwidgets();

  /**
   * Creates a new instance of a `Widget`.
   */
  @POST
  void createWidget(Widget body);

  /**
   * Gets the details of a single instance of a `Widget`.
   */
  @Path("/{widgetId}")
  @GET
  Widget getWidget(@PathParam("widgetId") String widgetId);

  /**
   * Updates an existing `Widget`.
   */
  @Path("/{widgetId}")
  @PUT
  void updateWidget(@PathParam("widgetId") String widgetId, Widget body);

  /**
   * Deletes an existing `Widget`.
   */
  @Path("/{widgetId}")
  @DELETE
  void deleteWidget(@PathParam("widgetId") String widgetId);
}
