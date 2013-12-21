package cloudioa.mymod.platipusmod.render;

import cloudioa.mymod.platipusmod.entity.EntityPlatypus;
import cloudioa.mymod.platipusmod.model.platypusmodel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class RenderPlatypus extends RenderLiving{

	public RenderPlatypus(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		model = ((platypusmodel)mainModel);
	}
protected platypusmodel model;	


public void renderplatypus(EntityPlatypus entity, double par2,double par4, double par6, float par8, float par9) {
	super.doRenderLiving(entity, par2, par4 ,par6, par8, par9);

}
public void doRenderLiving(EntityLiving par1EntityLiving , double par2, double par4, double par6, float par8, float par9) {
	renderplatypus((EntityPlatypus)par1EntityLiving, par2, par4, par6, par8, par9);

}
public void doRender(Entity par1Entity, double par2, double par4,double par6 , float par8, float par9) {
	renderplatypus((EntityPlatypus)par1Entity, par2, par4, par6, par8, par9);
}


}

