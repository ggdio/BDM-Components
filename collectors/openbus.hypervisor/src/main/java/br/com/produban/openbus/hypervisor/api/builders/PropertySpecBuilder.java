package br.com.produban.openbus.hypervisor.api.builders;

import com.vmware.vim25.PropertySpec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PropertySpecBuilder extends PropertySpec {
	private void init() {
		if (pathSet == null) {
			pathSet = new ArrayList<String>();
		}
	}

	public PropertySpecBuilder all(final Boolean all) {
		this.setAll(all);
		return this;
	}

	public PropertySpecBuilder type(final String type) {
		this.setType(type);
		return this;
	}

	public PropertySpecBuilder pathSet(final String... paths) {
		init();
		this.pathSet.addAll(Arrays.asList(paths));
		return this;
	}

	public PropertySpecBuilder addToPathSet(final Collection<String> paths) {
		init();
		this.pathSet.addAll(paths);
		return this;
	}
}
