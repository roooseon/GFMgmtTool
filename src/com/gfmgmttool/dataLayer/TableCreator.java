package com.gfmgmttool.dataLayer;
import org.json.simple.*;
import org.json.simple.parser.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.function.Consumer;
/**
 * @author suman
 * @NameSpace TableCreator
 * @Description Creates database tables from json files in JSON folder
 */
public class TableCreator {
	/*
	 * @memberOf TableCreator
	 * @method CreateTable
	 * @description scans JSON folder and creates sql query for table creation
	 * @params {Connection} c db connection
	 * */
	public void createTable(Connection c) {
		Consumer<String> sqlCreator = new Consumer<String>() {
			@Override
			public void accept(String s) {
				try {
					FileReader givenJSON = new FileReader(s);
					JSONParser parser = new JSONParser();
					StringBuilder sql = new StringBuilder();
					JSONObject jsonObj = (JSONObject)parser.parse(givenJSON);
					JSONArray array = (JSONArray)jsonObj.get("model");
					sql.append("Create table " + jsonObj.get("name") + " (");
					for(Object a : array) {
						JSONObject entry = (JSONObject)a;
						sql.append(entry.get("name") + " ");
						sql.append(entry.get("type") + " ");
						if(entry.get("index") != null)
							sql.append(entry.get("index") + " ");
						if(entry.get("key") != null)
							sql.append(entry.get("key") + " ");
					}
					sql.append(")");
					// TODO: run sql query to create tables. Check if db exists
					System.out.println(sql);
				} catch (Exception e) {
					System.exit(0);
				}
			}
		};
		try {
			Files.walk(Paths.get("JSON"))
			 .filter(Files::isRegularFile)
			 .map(e->e.toString())
			 .forEach(sqlCreator);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
