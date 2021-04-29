package com.roytuts.cuke.flow.steps;

import java.util.Locale;
import java.util.Map;

import com.roytuts.cuke.flow.vo.EmpBonus;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableEntryTransformer;

public class Configurer implements TypeRegistryConfigurer {
	@Override
	public void configureTypeRegistry(TypeRegistry registry) {
		registry.defineDataTableType(new DataTableType(EmpBonus.class, new TableEntryTransformer<EmpBonus>() {
			@Override
			public EmpBonus transform(Map<String, String> entry) {
				return EmpBonus.createEmpBonus(entry);
			}
		}));
	}

	@Override
	public Locale locale() {
		return Locale.ENGLISH;
	}

}
