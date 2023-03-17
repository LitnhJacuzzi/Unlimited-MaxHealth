package org.litnhjacuzzi.unlimitedmaxhealth;

import java.lang.reflect.Field;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraftforge.fml.common.Mod;

@Mod("unlimitedmaxhealth")
public class UnlimitedMaxHealth 
{
	public UnlimitedMaxHealth() {
		try {
			Field maximumValueField = RangedAttribute.class.getDeclaredField("f_22308_");
			maximumValueField.setAccessible(true);
			maximumValueField.set(Attributes.MAX_HEALTH, Double.MAX_VALUE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
