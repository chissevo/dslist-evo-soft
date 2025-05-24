package com.devevosoft.dslist.dto;

import com.devevosoft.dslist.entities.Game;

public class GameMinDTO {
	
	
	private Long id;
	private String title;
	private Integer year;
	private String imagUrl;
	private String shortDescription;
	
	public GameMinDTO()
	{
		
	}
	

	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imagUrl = entity.getImagUrl();
		shortDescription = entity.getShortDescription();
	}


	public Long getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public Integer getYear() {
		return year;
	}


	public String getImagUrl() {
		return imagUrl;
	}


	public String getShortDescription() {
		return shortDescription;
	}


	
	

}
