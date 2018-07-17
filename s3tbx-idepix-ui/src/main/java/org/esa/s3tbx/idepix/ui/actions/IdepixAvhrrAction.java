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

import org.esa.snap.rcp.actions.AbstractSnapAction;

import java.awt.event.ActionEvent;

/**
 * Idepix action for AVHRR algorithm.
 *
 * @author Olaf Danne
 */
// todo: activate when ready to publish
//@ActionID(category = "Processing", id = "org.esa.s3tbx.idepix.ui.actions.IdepixAvhrrAction")
//@ActionRegistration(displayName = "#CTL_IdepixAvhrrAction_Text")
//@ActionReference(path = "Menu/Optical/Preprocessing/IdePix Pixel Classification", position = 900)
//@NbBundle.Messages({"CTL_IdepixAvhrrAction_Text=Avhrr"})
public class IdepixAvhrrAction extends AbstractSnapAction {

    private static final String HELP_ID = "idepixS3Tool";

    public IdepixAvhrrAction() {
        // todo: activate when ready to publish
//        putValue(Action.SHORT_DESCRIPTION, "Performs pixel classification on an AVHRR data product.");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // todo: activate when ready to publish
//        final OperatorMetadata opMetadata = AvhrrOp.class.getAnnotation(OperatorMetadata.class);
//        final IdepixDefaultDialog dialog = new IdepixDefaultDialog(opMetadata.alias(),
//                                                                   getAppContext(),
//                                                                   "Idepix (AVHRR mode)",
//                                                                   HELP_ID,
//                                                                   "_idepix");
//        dialog.getJDialog().pack();
//        dialog.show();
    }
}
