package org.litnhjacuzzi.unlimitedmaxhealth;

import java.lang.reflect.Field;

import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.fml.common.Mod;

@Mod("unlimitedmaxhealth")
public class UnlimitedMaxHealth 
{
	public UnlimitedMaxHealth() {
		try {
			Field maximumValueField = RangedAttribute.class.getDeclaredField("field_111118_b");
			maximumValueField.setAccessible(true);
			maximumValueField.set(Attributes.MAX_HEALTH, Double.MAX_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
