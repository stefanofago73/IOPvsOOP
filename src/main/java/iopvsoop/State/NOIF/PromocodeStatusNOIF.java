package iopvsoop.State.NOIF;

import static iopvsoop.common.CSharpUtil.action;

import iopvsoop.common.CSharpUtil.Action;

/**
 * 
 * @author Stefano
 *
 */
public class PromocodeStatusNOIF {

	private Action alreadyUsed = action(() -> {
	});
	private Action expired = action(() -> {
	});
	private Action notValid = action(() -> {
	});

	public PromocodeStatusNOIF AlreadyUsed(Action action) {
		alreadyUsed = action;
		return this;
	}

	public PromocodeStatusNOIF Expired(Action action) {
		expired = action;
		return this;
	}

	public PromocodeStatusNOIF NotValid(Action action) {
		notValid = action;
		return this;
	}

	public void apply(String promocode) {
		expired.me.run();
	}

}// END