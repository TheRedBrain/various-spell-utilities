package com.github.theredbrain.variousspellutilities.mixin.entity.attribute;

import com.github.theredbrain.variousspellutilities.VariousSpellUtilities;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(EntityAttributes.class)
public class EntityAttributesMixin {
	static {
		VariousSpellUtilities.GENERIC_MAGIC_DAMAGE = Registry.registerReference(Registries.ATTRIBUTE, VariousSpellUtilities.identifier("generic.magic_damage"), new ClampedEntityAttribute("attribute.name.generic.EntityAttributesMixin", 0.0F, 0.0F, 1024.0F).setTracked(true));
	}
}
