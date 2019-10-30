package com.springboot_rest_api.controller;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot_rest_api.entity.Asn;
import com.springboot_rest_api.service.InterfaceService;

@RequestMapping()
@RestController
public class InterfaceContoller {

	@Autowired
	private InterfaceService interfaceService;

	@PostMapping("/save")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Asn save(@RequestBody Asn asn) {

		return interfaceService.saveAsn(asn);
	}
	
	

	/*
	 * @Autowired private AsnService asnService;
	 * 
	 * @Autowired private HeaderService headerService;
	 * 
	 * @Autowired private LineItemService itemService;
	 * 
	 * @Autowired private PurchaseOrder purchaseOrder;
	 * 
	 * 
	 * public void fromERP() throws JSONException{
	 * 
	 * // call the http client method of get - output as json string String
	 * url="http://localhost:8080/"; HttpClient client= new HttpClient(); PostMethod
	 * method= new PostMethod(url); method.setRequestHeader("Content-type", "json");
	 * 
	 * // create an object of header; and of iitem.; // String jsonPOH =
	 * "["poId" :"123" }]" // String jsonPOI = "["" :"" }]" PurchageOrderHeader
	 * header= new PurchageOrderHeader(); String jsonPOH=
	 * "{\"LogicalSystem\":\"Sergey\",\"Description\":\"Kargopolov\",\"POType\":\"Kargopolov\",\"ReferenceNumber\":\"Kargopolov\"}";
	 * PurchaseOrderLineItem item= new PurchaseOrderLineItem(); String jsonPLI=
	 * "{\"Po_Item_Id\":\"Sergey\",\"Logical_Id\":\"Kargopolov\",\"Material_Category\":\"Kargopolov\",\"Service_Category\":\"Kargopolov\"}";
	 * 
	 * // parse the json /...loop JSONArray jPOH= new JSONArray(jsonPOH);
	 * 
	 * for(int i=0; i<jPOH.length(); i++) { JSONObject obj = jPOH.getJSONObject(i);
	 * 
	 * String LogicalSystem = obj.getString("LogicalSystem"); String Description =
	 * obj.getString("Description"); String POType = obj.getString("POType"); String
	 * ReferenceNumber = obj.getString("ReferenceNumber");
	 * 
	 * System.out.println(LogicalSystem); System.out.println(Description);
	 * System.out.println(POType); System.out.println(ReferenceNumber); } // set the
	 * propterties of the object // header service. save() ?
	 * //System.out.println(purchaseOrder.save(jPOH)); }
	 * 
	 * @GetMapping public List<Asn> ToERP(){
	 * 
	 * // read all for asn .. //creae // we might post to a api ... // return <>
	 * return null; }
	 * 
	 * @PostMapping(path="/wsdl") public void getWSDL() throws WSDLException,
	 * MalformedURLException, IOException, URISyntaxException {
	 * 
	 * WSDLReader reader = WSDLFactory.newInstance().newWSDLReader(); Description
	 * desc= reader.read(new URL(
	 * "http://eccehp7.4vm.com:8073/sap/bc/srt/wsdl/flv_10002A111AD1/srvc_url/sap/bc/srt/rfc/sap/zws_po_deatils/800/zws_po_deatils/zpo_bind1?sap-client=800"
	 * ));
	 * 
	 * Service service = (Service) desc.getServices().get(0); List<Endpoint>
	 * endpoints = ((AbsItfService<InterfaceType, Endpoint>)
	 * service).getEndpoints();
	 * 
	 * Endpoint specificEndpoint = ((AbsItfService<InterfaceType, Endpoint>)
	 * service).getEndpoint("endpointName");
	 * 
	 * ((AbsItfService<InterfaceType, Endpoint>)
	 * service).addEndpoint(specificEndpoint);
	 * 
	 * ((AbsItfService<InterfaceType, Endpoint>)
	 * service).removeEndpoint("endpointName");
	 * 
	 * 
	 * Endpoint createdEndpoint = ((AbsItfService<InterfaceType, Endpoint>)
	 * service).createEndpoint(); ((AbsItfService<InterfaceType, Endpoint>)
	 * service).addEndpoint(createdEndpoint);
	 * 
	 * 
	 * 
	 * try {
	 * 
	 * WSDLReader reader1 = WSDLFactory.newInstance().newWSDLReader(); Description
	 * desc1 = reader1.read(new URL("file:///C:/your/file/path/sample.wsdl"));
	 * 
	 * Service service1 = (Service) desc1.getServices().get(0); List<Endpoint>
	 * endpoints1 = ((AbsItfService<InterfaceType, Endpoint>)
	 * service1).getEndpoints();
	 * 
	 * System.out.println(endpoints1.get(0).getAddress());
	 * 
	 * System.out.println(endpoints1.get(0).getBinding().getBindingOperations().get(
	 * 0).getHttpMethod());
	 * 
	 * System.out.println(endpoints1.get(0).getBinding().getInterface().
	 * getOperations().get(0).getInput().getElement().getType().getQName().
	 * getLocalPart());
	 * 
	 * } catch (WSDLException | IOException | URISyntaxException e1) {
	 * e1.printStackTrace(); } }
	 */

}
