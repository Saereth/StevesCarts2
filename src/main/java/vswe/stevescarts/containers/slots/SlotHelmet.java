package vswe.stevescarts.containers.slots;

import net.minecraft.world.Container;
import net.minecraft.world.item.ItemStack;

import javax.annotation.Nonnull;

public class SlotHelmet extends SlotBase
{
    public SlotHelmet(final Container iinventory, final int i, final int j, final int k)
    {
        super(iinventory, i, j, k);
    }

    @Override
    public boolean mayPlace(@Nonnull ItemStack itemstack)
    {
        return true;
        //		return itemstack.getItem() instanceof ArmorItem && ((ArmorItem) itemstack.getItem()).typez == EntityEquipmentSlot.HEAD;
    }
}
