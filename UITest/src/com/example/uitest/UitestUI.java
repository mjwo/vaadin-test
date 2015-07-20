package com.example.uitest;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
@Theme("uitest")
public class UitestUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = UitestUI.class)
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {
		layoutTest3(request);
	}
	protected void layoutTest3(VaadinRequest request) {

		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		GridLayout grid = new GridLayout(6,6);
		{
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("100%");
		}
		final Button btn1x = new Button("0,1");
		btn1x.setWidth("100%");
		grid.addComponent(btn1x, 0, 1);
		btn1x.setVisible(false);
		final Button btn2x = new Button("1,1,2,1");
		btn2x.setWidth("100%");
		btn2x.setVisible(false);
		grid.addComponent(btn2x, 1, 1, 2,1);
		final Button btn3x = new Button("3,1,5,1");
		btn3x.setWidth("100%");
		btn3x.setVisible(false);
		grid.addComponent(btn3x, 3, 1, 5, 1);
		{
		Button btn1 = new Button("0,2");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 2);
		Button btn2 = new Button("1,2,2,2");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 2, 2,2);
		Button btn3 = new Button("3,2,5,2");
		grid.addComponent(btn3, 3, 2, 5, 2);
		btn3.setWidth("100%");
		}
		{
		Button btn1 = new Button("0,3 (H100)");
		btn1.setWidth("100%");
		btn1.setHeight("100%");
		grid.addComponent(btn1, 0, 3);
//		Button btn2 = new Button("1,3,2,5");
//		btn2.setWidth("100%");
//		btn2.setHeight("100%");
//		grid.addComponent(btn2, 1, 3, 2, 5);
		InlineDateField data = new InlineDateField("2x2 1,3,2,4");
		data.setWidth("100%");
		grid.addComponent(data, 1, 3, 2, 4);
		Button btn3 = new Button("3,3,5,4");
		grid.addComponent(btn3, 3, 3, 5, 4);
		btn3.setWidth("100%");
		}
		{
		Button btn1 = new Button("0,5");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 5);
		Button btn2 = new Button("1,5,2,5");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 5, 2,5);
		Button btn3 = new Button("3,5,5,5");
		grid.addComponent(btn3, 3, 5, 5, 5);
		btn3.setWidth("100%");
		}

		grid.setWidth("100%");
		//grid.setSpacing(true);
		layout.addComponent(grid);
		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
				btn1x.setVisible(true);
				btn2x.setVisible(true);
				btn1x.setVisible(true);
			}
		});
		layout.addComponent(button);
	}

	protected void layoutTest2(VaadinRequest request) {

		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("100%");
		grid.setWidth("100%");
		grid.setSpacing(true);
		layout.addComponent(grid);
		}

		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0,2,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0, 2,0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("100%");
		grid.setWidth("100%");
		grid.setSpacing(true);
		layout.addComponent(grid);
		}
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0,2,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0, 2,0);
		Button btn3 = new Button("3,0");
		grid.addComponent(btn3, 3, 0);
		btn3.setWidth("100%");
		grid.setWidth("100%");
		grid.setSpacing(true);
		layout.addComponent(grid);
		}
		
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0,1,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0,1,0);
		Button btn3 = new Button("3,0");
		grid.addComponent(btn3, 3, 0);
		btn3.setWidth("100%");
		grid.setWidth("100%");
		grid.setSpacing(true);
		layout.addComponent(grid);
		}
		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(button);
	}
	protected void layoutTest(VaadinRequest request) {

		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		//btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0);
		grid.addComponent(new Button("3,0,5,0"), 3, 0, 5, 0);
		grid.setRowExpandRatio(1, 1);
		grid.setWidth("100%");
		layout.addComponent(grid);
		}
		
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("100%");
		grid.setRowExpandRatio(1, 1);
		grid.setWidth("100%");
		layout.addComponent(grid);
		}
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("100%");
		grid.setRowExpandRatio(1, 1);
		grid.setWidth("100%");
		grid.setMargin(true);
		layout.addComponent(grid);
		}
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("100%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("100%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("100%");
		grid.setRowExpandRatio(1, 1);
		grid.setWidth("100%");
		grid.setSpacing(true);
		layout.addComponent(grid);
		}
		
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("98%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("98%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("98%");
		grid.setRowExpandRatio(1, 1);
		grid.setWidth("100%");
		layout.addComponent(grid);
		}

		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("98%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("98%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("98%");
		grid.setWidth("100%");
		layout.addComponent(grid);
		}

		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("98%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("98%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("98%");
		grid.setRowExpandRatio(1, 1);
		layout.addComponent(grid);
		}
		
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("98%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("98%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("98%");
		layout.addComponent(grid);
		}
		
		{
		GridLayout grid = new GridLayout(6,1);
		Button btn1 = new Button("0,0");
		btn1.setWidth("98%");
		grid.addComponent(btn1, 0, 0);
		Button btn2 = new Button("1,0");
		btn2.setWidth("98%");
		grid.addComponent(btn2, 1, 0);
		Button btn3 = new Button("3,0,5,0");
		grid.addComponent(btn3, 3, 0, 5, 0);
		btn3.setWidth("98%");
		grid.setWidth("800px");
		layout.addComponent(grid);
		}

		
		Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(button);
	}
}