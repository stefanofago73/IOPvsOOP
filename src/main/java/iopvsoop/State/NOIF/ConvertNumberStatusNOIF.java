package iopvsoop.State.NOIF;

import static iopvsoop.common.CSharpUtil.TryParse;

import java.util.function.Consumer;

import iopvsoop.common.IntHolder;

/**
 * 
 * @author Stefano
 *
 */
public class ConvertNumberStatusNOIF {

	public static void Parse(String number, Consumer<Integer> action) {
		IntHolder holder = new IntHolder();
		if (TryParse(number, holder))
			action.accept(holder.value);
	}

}// END
