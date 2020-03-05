package com.restfulapi.controllers;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("list")
public class ListApiController {
	private static Item ITEM = new Item("Hello, World");
	private static List<Item> ITEMS = Arrays.asList(ITEM);
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String list() throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(ITEMS);
	}

	public static class Item {
		private String name;
		
		public Item(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}
}