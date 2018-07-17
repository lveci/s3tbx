/* 
 * Copyright (C) 2002-2008 by Brockmann Consult
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the
 * Free Software Foundation. This program is distributed in the hope it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.esa.s3tbx.idepix.ui.actions;

import org.esa.s3tbx.idepix.algorithms.meris.MerisOp;
import org.esa.snap.core.gpf.annotations.OperatorMetadata;
import org.esa.snap.core.gpf.ui.DefaultSingleTargetProductDialog;
import org.esa.snap.rcp.actions.AbstractSnapAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle;

import javax.swing.Action;
import java.awt.event.ActionEvent;

/**
 * Idepix action for MERIS algorithm.
 *
 * @author Olaf Danne
 */
@ActionID(category = "Processing", id = "org.esa.s3tbx.idepix.ui.actions.IdepixMerisAction")
@ActionRegistration(displayName = "#CTL_IdepixMerisAction_Text")
//@ActionReference(path = "Menu/Optical/Preprocessing/IdePix Pixel Classification", position = 0)
@ActionReference(path = "Menu/Optical/Preprocessing/Masking/IdePix (Clouds, Land, Water, ...)", position = 400)
@NbBundle.Messages({"CTL_IdepixMerisAction_Text=Envisat MERIS"})
public class IdepixMerisAction extends AbstractSnapAction {

    private static final String HELP_ID = "idepixS3Tool";

    public IdepixMerisAction() {
        putValue(Action.SHORT_DESCRIPTION, "Performs pixel classification on a MERIS data product.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final OperatorMetadata opMetadata = MerisOp.class.getAnnotation(OperatorMetadata.class);

        final DefaultSingleTargetProductDialog dialog =
                new DefaultSingleTargetProductDialog(opMetadata.alias(),
                                                     getAppContext(),
                                                     "Idepix (Envisat MERIS mode)",
                                                     HELP_ID);

        dialog.setTargetProductNameSuffix("_IDEPIX");
        dialog.getJDialog().pack();
        dialog.show();
    }
}
