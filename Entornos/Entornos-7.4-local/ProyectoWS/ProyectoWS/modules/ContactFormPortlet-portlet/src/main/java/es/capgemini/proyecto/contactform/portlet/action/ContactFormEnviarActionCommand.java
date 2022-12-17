/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package es.capgemini.proyecto.contactform.portlet.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;

import es.capgemini.proyecto.contactform.portlet.constants.ContactFormPortletKeys;

@Component(immediate = true, property = { "javax.portlet.name=" + ContactFormPortletKeys.CONTACTFORM,
		"mvc.command.name=/form/enviar" }, service = MVCActionCommand.class)
public class ContactFormEnviarActionCommand implements MVCActionCommand {
	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {

		// Recojo variables
		String name = ParamUtil.getString(actionRequest, "name", "");
		actionRequest.setAttribute("name", name);
		_log.info(name);

		String email = ParamUtil.getString(actionRequest, "email", "");
		actionRequest.setAttribute("email", email);
		_log.info(email);

		String selectMotivo = ParamUtil.getString(actionRequest, "selectMotivo", "");
		actionRequest.setAttribute("selectMotivo", selectMotivo);
		_log.info(selectMotivo);

		String message = ParamUtil.getString(actionRequest, "message", "");
		actionRequest.setAttribute("message", message);
		_log.info(message);
		// Fin recojo variables

		if (name != "") {
			SessionMessages.add(actionRequest, "mensajeEnviado");
		} else {
			SessionMessages.add(actionRequest, "mensajeNoEnviado");
		}

		return true;
	}

	private static final Log _log = LogFactoryUtil.getLog(ContactFormEnviarActionCommand.class);
}