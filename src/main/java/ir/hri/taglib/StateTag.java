package ir.hri.taglib;

import ir.hri.business.State;
import ir.hri.entity.StateEntity;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.List;

public class StateTag extends SimpleTagSupport {

    public void doTag() throws JspException, IOException {

        JspWriter out = getJspContext().getOut();
        State state = new State();
        List<StateEntity> stateEntities = state.getStates();

        out.println("<select>");
        for (StateEntity stateEntity : stateEntities) {
            out.println("<option value=" + stateEntity.getId() + " >" + stateEntity.getName() + "</option>");
        }
        out.println("</select>");
    }
}