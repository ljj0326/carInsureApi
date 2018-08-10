package com.songzhi.carInsure.core.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

//import com.cic.insurance.components.dto.ReqParmV7204DTO;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class CICBeanUtil {

	public static Map getXmlFromJsonObject(JSONObject requestObject,boolean isTpf,Map tagMap) {
		String isbase_part =  (String) tagMap.get("isbase_part");
		String isvhl_info =  (String) tagMap.get("isvhl_info");
		String isvhlowner =  (String) tagMap.get("isvhlowner");
		String ispolicyholder =  (String) tagMap.get("ispolicyholder");
		String isinsured =  (String) tagMap.get("isinsured");
		String ischkdata =  (String) tagMap.get("ischkdata");
		String isoffer_spec_agmt_list =  (String) tagMap.get("isoffer_spec_agmt_list");
		String isdriver_list =  (String) tagMap.get("isdriver_list");
		String isprm_coef_traffic_list =  (String) tagMap.get("isprm_coef_traffic_list");
		String issale_list =  (String) tagMap.get("issale_list");
		String ischit_data =  (String) tagMap.get("ischit_data");
		String isprm_coef_business_list =  (String) tagMap.get("isprm_coef_business_list");
		String isc_unfix_spc_data =  (String) tagMap.get("isc_unfix_spc_data");
		
		Map resMap = new HashMap();
		StringBuffer sb = new StringBuffer("");
		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sb.append("<PACKET type=\"REQUEST\" version=\"1.0\">");
		String transtype = StringUtils.EMPTY;
		if (!requestObject.isNullObject() && requestObject.containsKey("head")) {
			JSONObject headobj = requestObject.getJSONObject("head");
			if (!headobj.isNullObject()) {
				sb.append("<HEAD>");
				String trans_type = StringUtils.EMPTY;
				if (headobj.containsKey("trans_type")) {
					trans_type = headobj.getString("trans_type");
					if (StringUtils.isNotEmpty(trans_type)) {
						sb.append("<TRANS_TYPE>");
						sb.append(trans_type);
						sb.append("</TRANS_TYPE>");
					}
					transtype = trans_type;
				}
				
				String user = StringUtils.EMPTY;
				String password = StringUtils.EMPTY;
				
				if(transtype.indexOf("V")<0){
					//合作伙伴接口交易类型---B
					if(requestObject.containsKey("user_b")){
						user = requestObject.getString("user_b");
					}
					
					if(requestObject.containsKey("password_b")){
						password = requestObject.getString("password_b");
					}
				}else{
					//合作伙伴接口交易类型---V
					if(requestObject.containsKey("user")){
						user = requestObject.getString("user");
					}
					if(requestObject.containsKey("password")){
						password = requestObject.getString("password");
					}
				}
				
				
				if (headobj.containsKey("user")) {
					if("".equals(user)){
						user = headobj.getString("user");
					}
					if (StringUtils.isNotEmpty(user)) {
						sb.append("<USER>");
						sb.append(user);
						sb.append("</USER>");
					}
					resMap.put("user", user);
				}
				if (headobj.containsKey("password")) {
					if("".equals(password)){
						password = headobj.getString("password");
					}
					if (StringUtils.isNotEmpty(password)) {
						sb.append("<PASSWORD>");
						sb.append(password);
						sb.append("</PASSWORD>");
					}
					resMap.put("password", password);
				}
				if("V7618".equals(trans_type) ){
					
				}else if("V7301".equals(trans_type) || "V7203".equals(trans_type) || "V7620".equals(trans_type) || "V7610".equals(trans_type)) {
					String serialno = trans_type + System.currentTimeMillis();
					if (StringUtils.isNotEmpty(serialno)) {
						sb.append("<SERIALDECIMAL>");
						sb.append(serialno);
						sb.append("</SERIALDECIMAL>");
					}
				}else{
					String serialdecimal = trans_type + System.currentTimeMillis();
					if (StringUtils.isNotEmpty(serialdecimal)) {
						sb.append("<SERIALNO>");
						sb.append(serialdecimal);
						sb.append("</SERIALNO>");
					}
				}
				sb.append("</HEAD>");
			}
		}
		if (!requestObject.isNullObject() && requestObject.containsKey("body")) {
			JSONObject bodyobj = requestObject.getJSONObject("body");
			String tpf_c_prod_no = StringUtils.EMPTY;
			String biz_c_prod_no = StringUtils.EMPTY;
			String tinsrncbgntmbiz  = StringUtils.EMPTY;
			String tinsrncbgntmtpf  = StringUtils.EMPTY;
			if (bodyobj.containsKey("tpf_c_prod_no")) {
				tpf_c_prod_no= bodyobj.getString("tpf_c_prod_no");
				
			}
			if (bodyobj.containsKey("biz_c_prod_no")) {
				biz_c_prod_no = bodyobj.getString("biz_c_prod_no");
				
			}
			if (!bodyobj.isNullObject()) {
				sb.append("<BODY>");
				if (bodyobj.containsKey("base_part") || bodyobj.containsKey("base_part_tpf") || bodyobj.containsKey("base_part_biz")) {
					JSONObject basobj = null;
					String cdptcde = StringUtils.EMPTY;
					if("V7203".equals(transtype)){
						if(isTpf){
							if(bodyobj.containsKey("base_part_tpf")){
								 basobj = bodyobj.getJSONObject("base_part_tpf");
							}
						}else{
							if(bodyobj.containsKey("base_part_biz")){
								 basobj = bodyobj.getJSONObject("base_part_biz");
							}
						}
					}else{
						if(bodyobj.containsKey("base_part")){
							 basobj = bodyobj.getJSONObject("base_part");
						}
					}
					if (basobj != null && "Y".equals(isbase_part)) {
						sb.append("<BASE_PART>");
						if (basobj.containsKey("c_ply_no")) {
							String cplyno = basobj.getString("c_ply_no");
							if (StringUtils.isNotEmpty(cplyno)) {
								sb.append("<C_PLY_NO>");
								sb.append(cplyno);
								sb.append("</C_PLY_NO>");
							}
						}
						if (basobj.containsKey("c_dpt_cde")) {
							 cdptcde = basobj.getString("c_dpt_cde");
							if (StringUtils.isNotEmpty(cdptcde)) {
								sb.append("<C_DPT_CDE>");
								sb.append(cdptcde);
								sb.append("</C_DPT_CDE>");
								resMap.put("c_dpt_cde", cdptcde);
							}
						}
						if(isTpf){
							if (bodyobj.containsKey("tpf_c_prod_no")) {
								sb.append("<C_PROD_NO>");
								sb.append(tpf_c_prod_no);
								sb.append("</C_PROD_NO>");
							}
							
						}else{
							if ( (biz_c_prod_no == null || "".equals(biz_c_prod_no) ) && (basobj.containsKey("c_prod_no"))) {
								String c_prod_no = basobj.getString("c_prod_no");
								sb.append("<C_PROD_NO>");
								sb.append(c_prod_no);
								sb.append("</C_PROD_NO>");
							}else{
								if (bodyobj.containsKey("biz_c_prod_no")) {
									sb.append("<C_PROD_NO>");
									sb.append(biz_c_prod_no);
									sb.append("</C_PROD_NO>");
								}
							}
						}
						
						if (basobj.containsKey("c_order_no")) {
							String c_order_no="zyb"+System.currentTimeMillis()+RandomUtils.toFixdLengthString((int)(Math.random()*100000),6);
							//String corderno = basobj.getString("c_order_no");
							sb.append("<C_ORDER_NO>");
							sb.append(c_order_no);
							sb.append("</C_ORDER_NO>");
						}
						
						if (basobj.containsKey("c_insrnc_bgn_tm")) {
							String c_insrnc_bgn_tm = basobj.getString("c_insrnc_bgn_tm");
							if (StringUtils.isNotEmpty(c_insrnc_bgn_tm)) {
								sb.append("<C_INSRNC_BGN_TM>");
								sb.append(c_insrnc_bgn_tm);
								sb.append("</C_INSRNC_BGN_TM>");
							}
						}
						
						if (basobj.containsKey("c_insrnc_end_tm")) {
							String c_insrnc_end_tm = basobj.getString("c_insrnc_end_tm");
							if (StringUtils.isNotEmpty(c_insrnc_end_tm)) {
								sb.append("<C_INSRNC_END_TM>");
								sb.append(c_insrnc_end_tm);
								sb.append("</C_INSRNC_END_TM>");
							}
						}
						
						
						if (basobj.containsKey("c_qry_cde")) {
							String cqrycde = basobj.getString("c_qry_cde");
							if (StringUtils.isNotEmpty(cqrycde)) {
								sb.append("<C_QRY_CDE>");
								sb.append(cqrycde);
								sb.append("</C_QRY_CDE>");
							}
						}
						if(isTpf){
							if(basobj.containsKey("c_app_typ_tpf")){
								String capptyptpf = basobj.getString("c_app_typ_tpf");
								if(StringUtils.isNotEmpty(capptyptpf)){
									sb.append("<C_APP_TYP>");
									sb.append(capptyptpf);
									sb.append("</C_APP_TYP>");
								}
							}else{
								if (basobj.containsKey("c_app_typ")) {
									String capptyp = basobj.getString("c_app_typ");
									if(StringUtils.isEmpty(capptyp)){
										capptyp = "N";
									}
									if (StringUtils.isNotEmpty(capptyp)) {
										sb.append("<C_APP_TYP>");
										sb.append(capptyp);
										sb.append("</C_APP_TYP>");
									}
								}else{
									sb.append("<C_APP_TYP>");
									sb.append("");
									sb.append("</C_APP_TYP>");
								}
							}
						}else{
							if(basobj.containsKey("c_app_typ_biz")){
								String capptypbiz = basobj.getString("c_app_typ_biz");
								if(StringUtils.isNotEmpty(capptypbiz)){
									sb.append("<C_APP_TYP>");
									sb.append(capptypbiz);
									sb.append("</C_APP_TYP>");
								}
							}else{
								if (basobj.containsKey("c_app_typ")) {
									String capptyp = basobj.getString("c_app_typ");
									if(StringUtils.isEmpty(capptyp)){
										capptyp = "N";
									}
									if (StringUtils.isNotEmpty(capptyp)) {
										sb.append("<C_APP_TYP>");
										sb.append(capptyp);
										sb.append("</C_APP_TYP>");
									}
								}else{
									sb.append("<C_APP_TYP>");
									sb.append("");
									sb.append("</C_APP_TYP>");
								}
							}
						}
						
						if (basobj.containsKey("c_bsns_typ")) {
							String cbsnstyp = basobj.getString("c_bsns_typ");
							if (StringUtils.isNotEmpty(cbsnstyp)) {
								sb.append("<C_BSNS_TYP>");
								sb.append(cbsnstyp);
								sb.append("</C_BSNS_TYP>");
							}
							resMap.put("c_bsns_typ", cbsnstyp);
						}
						if(isTpf){
							if (basobj.containsKey("c_immeff_mrk_tpf")) {
								String c_immeff_mrk_tpf = basobj.getString("c_immeff_mrk_tpf");
								if (StringUtils.isNotEmpty(c_immeff_mrk_tpf)) {
									sb.append("<C_IMMEFF_MRK>");
									sb.append(c_immeff_mrk_tpf);
									sb.append("</C_IMMEFF_MRK>");
								}
								
								resMap.put("c_immeff_mrk", c_immeff_mrk_tpf);
							}
						}else{
							if (basobj.containsKey("c_immeff_mrk_biz")) {
								String c_immeff_mrk_biz = basobj.getString("c_immeff_mrk_biz");
								if (StringUtils.isNotEmpty(c_immeff_mrk_biz)) {
									sb.append("<C_IMMEFF_MRK>");
									sb.append(c_immeff_mrk_biz);
									sb.append("</C_IMMEFF_MRK>");
								}
								resMap.put("c_immeff_mrk", c_immeff_mrk_biz);
							}
						}
						
						if (basobj.containsKey("c_new_flg")) {
							String cnewflg = basobj.getString("c_new_flg");
							if (StringUtils.isNotEmpty(cnewflg)) {
								sb.append("<C_NEW_FLG>");
								sb.append(cnewflg);
								sb.append("</C_NEW_FLG>");
							}
						}
						if (basobj.containsKey("c_renew_mrk")) {
							String crenewmrk = basobj.getString("c_renew_mrk");
							if (StringUtils.isNotEmpty(crenewmrk)) {
								sb.append("<C_RENEW_MRK>");
								sb.append(crenewmrk);
								sb.append("</C_RENEW_MRK>");
							}
						}
//						if (basobj.containsKey("c_orig_ply_no")) {
//							String corigplyno = basobj.getString("c_orig_ply_no");
//							if (StringUtils.isNotEmpty(corigplyno)) {
//								sb.append("<C_ORIG_PLY_NO>");
//								sb.append(corigplyno);
//								sb.append("</C_ORIG_PLY_NO>");
//							}
//						}
						
						if (basobj.containsKey("c_orig_ply_no_biz") && !isTpf) {
							String corigplynobiz = basobj.getString("c_orig_ply_no_biz");
							if (StringUtils.isNotEmpty(corigplynobiz)) {
								sb.append("<C_ORIG_PLY_NO>");
								sb.append(corigplynobiz);
								sb.append("</C_ORIG_PLY_NO>");
							}
						}
						if (basobj.containsKey("c_orig_ply_no_tpf") && isTpf) {
							String corigplynotpf = basobj.getString("c_orig_ply_no_tpf");
							if (StringUtils.isNotEmpty(corigplynotpf)) {
								sb.append("<C_ORIG_PLY_NO>");
								sb.append(corigplynotpf);
								sb.append("</C_ORIG_PLY_NO>");
							}
						}
						
						if (basobj.containsKey("c_interfer_flag")) {
							String c_interfer_flag = basobj.getString("c_interfer_flag");
							if (StringUtils.isNotEmpty(c_interfer_flag)) {
								sb.append("<C_INTERFER_FLAG>");
								sb.append(c_interfer_flag);
								sb.append("</C_INTERFER_FLAG>");
							}
						}
						
						if (basobj.containsKey("c_offer_mrk")) {
							String coffermrk = basobj.getString("c_offer_mrk");
							if (StringUtils.isNotEmpty(coffermrk)) {
								sb.append("<C_OFFER_MRK>");
								sb.append(coffermrk);
								sb.append("</C_OFFER_MRK>");
							}
						}
						if (basobj.containsKey("c_offer_no")) {
							String cofferno = basobj.getString("c_offer_no");
							if (StringUtils.isNotEmpty(cofferno)) {
								sb.append("<C_OFFER_NO>");
								sb.append(cofferno);
								sb.append("</C_OFFER_NO>");
							}
						}
						
						if (basobj.containsKey("c_offer_no_tpf") && isTpf) {
							String c_offer_no_tpf = basobj.getString("c_offer_no_tpf");
							if (StringUtils.isNotEmpty(c_offer_no_tpf)) {
								sb.append("<C_OFFER_NO>");
								sb.append(c_offer_no_tpf);
								sb.append("</C_OFFER_NO>");
							}
						}
						
						if (basobj.containsKey("c_offer_no_biz") && !isTpf) {
							String c_offer_no_biz = basobj.getString("c_offer_no_biz");
							if (StringUtils.isNotEmpty(c_offer_no_biz)) {
								sb.append("<C_OFFER_NO>");
								sb.append(c_offer_no_biz);
								sb.append("</C_OFFER_NO>");
							}
						}
						
						
						if (basobj.containsKey("n_pay_ratio")) {
							String n_pay_ratio = basobj.getString("n_pay_ratio");
							if (StringUtils.isNotEmpty(n_pay_ratio)) {
								sb.append("<N_PAY_RATIO>");
								sb.append(n_pay_ratio);
								sb.append("</N_PAY_RATIO>");
							}
						}
						
						if (basobj.containsKey("n_cost_rate")) {
							String n_cost_rate = basobj.getString("n_cost_rate");
							if (StringUtils.isNotEmpty(n_cost_rate)) {
								sb.append("<N_COST_RATE>");
								sb.append(n_cost_rate);
								sb.append("</N_COST_RATE>");
							}
						}
						
						if (basobj.containsKey("c_cost_ratio_level")) {
							String c_cost_ratio_level = basobj.getString("c_cost_ratio_level");
							if (StringUtils.isNotEmpty(c_cost_ratio_level)) {
								sb.append("<C_COST_RATIO_LEVEL>");
								sb.append(c_cost_ratio_level);
								sb.append("</C_COST_RATIO_LEVEL>");
							}
						}
						
						if (basobj.containsKey("n_cost_ratio")) {
							String n_cost_ratio = basobj.getString("n_cost_ratio");
							if (StringUtils.isNotEmpty(n_cost_ratio)) {
								sb.append("<N_COST_RATIO>");
								sb.append(n_cost_ratio);
								sb.append("</N_COST_RATIO>");
							}
						}
						
						if (basobj.containsKey("n_profit_ratio")) {
							String n_profit_ratio = basobj.getString("n_profit_ratio");
							if (StringUtils.isNotEmpty(n_profit_ratio)) {
								sb.append("<N_PROFIT_RATIO>");
								sb.append(n_profit_ratio);
								sb.append("</N_PROFIT_RATIO>");
							}
						}
						
						if (basobj.containsKey("t_issue_tm")) {
							String tissuetm = basobj.getString("t_issue_tm");
							if (StringUtils.isNotEmpty(tissuetm)) {
								sb.append("<T_ISSUE_TM>");
								sb.append(tissuetm);
								sb.append("</T_ISSUE_TM>");
							}
							resMap.put("t_issue_tm", tissuetm);
						}
						if(isTpf){
							if (basobj.containsKey("t_insrnc_bgn_tm_tpf")) {
								tinsrncbgntmtpf = basobj.getString("t_insrnc_bgn_tm_tpf");
								if (StringUtils.isNotEmpty(tinsrncbgntmtpf)) {
									sb.append("<T_INSRNC_BGN_TM>");
									sb.append(tinsrncbgntmtpf);
									sb.append("</T_INSRNC_BGN_TM>");
								}
								
								resMap.put("t_insrnc_bgn_tm", tinsrncbgntmtpf);
							}
							if (basobj.containsKey("t_insrnc_end_tm_tpf")) {
								String tinsrncendtm = basobj.getString("t_insrnc_end_tm_tpf");
								if (StringUtils.isNotEmpty(tinsrncendtm)) {
									sb.append("<T_INSRNC_END_TM>");
									sb.append(tinsrncendtm);
									sb.append("</T_INSRNC_END_TM>");
								}
								
								resMap.put("t_insrnc_end_tm", tinsrncendtm);
							}
							
//							if (basobj.containsKey("c_insrnc_bgn_tm_tpf")) {
//								String cinsrncbgntm = basobj.getString("c_insrnc_bgn_tm_tpf");
//								if (StringUtils.isNotEmpty(cinsrncbgntm)) {
//									sb.append("<C_INSRNC_BGN_TM>");
//									sb.append(cinsrncbgntm);
//									sb.append("</C_INSRNC_BGN_TM>");
//								}
//							}
//							if (basobj.containsKey("c_insrnc_end_tm_tpf")) {
//								String cinsrncendtm = basobj.getString("c_insrnc_end_tm_tpf");
//								if (StringUtils.isNotEmpty(cinsrncendtm)) {
//									sb.append("<C_INSRNC_END_TM>");
//									sb.append(cinsrncendtm);
//									sb.append("</C_INSRNC_END_TM>");
//								}
//							}
						}else{
							if (basobj.containsKey("t_insrnc_bgn_tm_biz")) {
								tinsrncbgntmbiz = basobj.getString("t_insrnc_bgn_tm_biz");
								if (StringUtils.isNotEmpty(tinsrncbgntmbiz)) {
									sb.append("<T_INSRNC_BGN_TM>");
									sb.append(tinsrncbgntmbiz);
									sb.append("</T_INSRNC_BGN_TM>");
								}
								resMap.put("t_insrnc_bgn_tm", tinsrncbgntmbiz);
							}
							if (basobj.containsKey("t_insrnc_end_tm_biz")) {
								String tinsrncendtm = basobj.getString("t_insrnc_end_tm_biz");
								if (StringUtils.isNotEmpty(tinsrncendtm)) {
									sb.append("<T_INSRNC_END_TM>");
									sb.append(tinsrncendtm);
									sb.append("</T_INSRNC_END_TM>");
								}
								resMap.put("t_insrnc_end_tm", tinsrncendtm);
							}
						}
						if (basobj.containsKey("sales_channel_code")) {
							String saleschannelcode = basobj.getString("sales_channel_code");
							if (StringUtils.isNotEmpty(saleschannelcode)) {
								sb.append("<SALES_CHANNEL_CODE>");
								sb.append(saleschannelcode);
								sb.append("</SALES_CHANNEL_CODE>");
							}
						}
						if (basobj.containsKey("n_add_rate")) {
							String naddrate = basobj.getString("n_add_rate");
							if (StringUtils.isNotEmpty(naddrate)) {
								sb.append("<N_ADD_RATE>");
								sb.append(naddrate);
								sb.append("</N_ADD_RATE>");
							}
						}
						if (basobj.containsKey("n_input_vat")) {
							String ninputvat = basobj.getString("n_input_vat");
							if (StringUtils.isNotEmpty(ninputvat)) {
								sb.append("<N_INPUT_VAT>");
								sb.append(ninputvat);
								sb.append("</N_INPUT_VAT>");
							}
						}
						if (basobj.containsKey("c_claim_amount")) {
							String cclaimamount = basobj.getString("c_claim_amount");
							if (StringUtils.isNotEmpty(cclaimamount)) {
								sb.append("<C_CLAIM_AMOUNT>");
								sb.append(cclaimamount);
								sb.append("</C_CLAIM_AMOUNT>");
							}
						}
						if (basobj.containsKey("c_last_company")) {
							String clastcompany = basobj.getString("c_last_company");
							if (StringUtils.isNotEmpty(clastcompany)) {
								sb.append("<C_LAST_COMPANY>");
								sb.append(clastcompany);
								sb.append("</C_LAST_COMPANY>");
							}
						}
						if (basobj.containsKey("c_no_claim_year")) {
							String cnoclaimyear = basobj.getString("c_no_claim_year");
							if (StringUtils.isNotEmpty(cnoclaimyear)) {
								sb.append("<C_NO_CLAIM_YEAR>");
								sb.append(cnoclaimyear);
								sb.append("</C_NO_CLAIM_YEAR>");
							}
						}
						if (basobj.containsKey("n_comrat_upper")) {
							String ncomratupper = basobj.getString("n_comrat_upper");
							if (StringUtils.isNotEmpty(ncomratupper)) {
								sb.append("<N_COMRAT_UPPER>");
								sb.append(ncomratupper);
								sb.append("</N_COMRAT_UPPER>");
							}
						}
						if (basobj.containsKey("c_pecc_time")) {
							String cpecctime = basobj.getString("c_pecc_time");
							if (StringUtils.isNotEmpty(cpecctime)) {
								sb.append("<C_PECC_TIME>");
								sb.append(cpecctime);
								sb.append("</C_PECC_TIME>");
							}
						}
						if (basobj.containsKey("n_tax_prm")) {
							String ntaxprm = basobj.getString("n_tax_prm");
							if (StringUtils.isNotEmpty(ntaxprm)) {
								sb.append("<N_TAX_PRM>");
								sb.append(ntaxprm);
								sb.append("</N_TAX_PRM>");
							}
						}
						if (basobj.containsKey("t_pay_bgn_tm")) {
							String tpaybgntm = basobj.getString("t_pay_bgn_tm");
							if (StringUtils.isNotEmpty(tpaybgntm)) {
								sb.append("<T_PAY_BGN_TM>");
								sb.append(tpaybgntm);
								sb.append("</T_PAY_BGN_TM>");
							}
						}
						if (basobj.containsKey("t_pay_end_tm")) {
							String tpayendtm = basobj.getString("t_pay_end_tm");
							if (StringUtils.isNotEmpty(tpayendtm)) {
								sb.append("<T_PAY_END_TM>");
								sb.append(tpayendtm);
								sb.append("</T_PAY_END_TM>");
							}
						}
						if (basobj.containsKey("t_app_tm")) {
							String tapptm = basobj.getString("t_app_tm");
							if (StringUtils.isNotEmpty(tapptm)) {
								sb.append("<T_APP_TM>");
								sb.append(tapptm);
								sb.append("</T_APP_TM>");
							}
						}
						if (basobj.containsKey("c_opr_cde")) {
							String coprcde = basobj.getString("c_opr_cde");
							if (StringUtils.isNotEmpty(coprcde)) {
								sb.append("<C_OPR_CDE>");
								sb.append(coprcde);
								sb.append("</C_OPR_CDE>");
							}
							resMap.put("c_opr_cde", coprcde);
						}
						if (basobj.containsKey("c_resv_txt_2")) {
							String cresvtxt2 = basobj.getString("c_resv_txt_2");
							if (StringUtils.isNotEmpty(cresvtxt2)) {
								sb.append("<C_RESV_TXT_2>");
								sb.append(cresvtxt2);
								sb.append("</C_RESV_TXT_2>");
							}
						}
						if (basobj.containsKey("c_sls_cde")) {
							String cslscde = basobj.getString("c_sls_cde");
							if (StringUtils.isNotEmpty(cslscde)) {
								sb.append("<C_SLS_CDE>");
								sb.append(cslscde);
								sb.append("</C_SLS_CDE>");
							}
							resMap.put("c_sls_cde", cslscde);
						}
						if (basobj.containsKey("c_sls_nme")) {
							String cslsnme = basobj.getString("c_sls_nme");
							if (StringUtils.isNotEmpty(cslsnme)) {
								sb.append("<C_SLS_NME>");
								sb.append(cslsnme);
								sb.append("</C_SLS_NME>");
							}
						}
						if (basobj.containsKey("c_sls_tel")) {
							String cslstel = basobj.getString("c_sls_tel");
							if (StringUtils.isNotEmpty(cslstel)) {
								sb.append("<C_SLS_TEL>");
								sb.append(cslstel);
								sb.append("</C_SLS_TEL>");
							}
						}
						if (basobj.containsKey("c_brkr_cde")) {
							String cbrkrcde = basobj.getString("c_brkr_cde");
							if (StringUtils.isNotEmpty(cbrkrcde)) {
								sb.append("<C_BRKR_CDE>");
								sb.append(cbrkrcde);
								sb.append("</C_BRKR_CDE>");
							}
							resMap.put("c_brkr_cde", cbrkrcde);
						}
						if (basobj.containsKey("c_agency_cde")) {
							String cagencycde = basobj.getString("c_agency_cde");
							if (StringUtils.isNotEmpty(cagencycde)) {
								sb.append("<C_AGENCY_CDE>");
								sb.append(cagencycde);
								sb.append("</C_AGENCY_CDE>");
							}
						}
						if (basobj.containsKey("c_agt_agr_no")) {
							String cagtagrno = basobj.getString("c_agt_agr_no");
							if (StringUtils.isNotEmpty(cagtagrno)) {
								sb.append("<C_AGT_AGR_NO>");
								sb.append(cagtagrno);
								sb.append("</C_AGT_AGR_NO>");
							}
						}
						if (basobj.containsKey("n_additional_cost_rate")) {
							String nadditionalcostrate = basobj.getString("n_additional_cost_rate");
							if (StringUtils.isNotEmpty(nadditionalcostrate)) {
								sb.append("<N_ADDITIONAL_COST_RATE>");
								sb.append(nadditionalcostrate);
								sb.append("</N_ADDITIONAL_COST_RATE>");
							}
						}
						if (basobj.containsKey("n_car_loss_prm")) {
							String ncarlossprm = basobj.getString("n_car_loss_prm");
							if (StringUtils.isNotEmpty(ncarlossprm)) {
								sb.append("<N_CAR_LOSS_PRM>");
								sb.append(ncarlossprm);
								sb.append("</N_CAR_LOSS_PRM>");
							}
						}
						if (basobj.containsKey("bn_base_prm")) {
							String bnbaseprm = basobj.getString("bn_base_prm");
							if (StringUtils.isNotEmpty(bnbaseprm)) {
								sb.append("<BN_BASE_PRM>");
								sb.append(bnbaseprm);
								sb.append("</BN_BASE_PRM>");
							}
						}
						if (basobj.containsKey("n_change_rate") && !isTpf) {
							String nchangerate = basobj.getString("n_change_rate");
							if (StringUtils.isNotEmpty(nchangerate)) {
								sb.append("<N_CHANGE_RATE>");
								sb.append(nchangerate);
								sb.append("</N_CHANGE_RATE>");
							}
						}
						if (basobj.containsKey("c_service_code")) {
							String cservicecode = basobj.getString("c_service_code");
							if (StringUtils.isNotEmpty(cservicecode)) {
								sb.append("<C_SERVICE_CODE>");
								sb.append(cservicecode);
								sb.append("</C_SERVICE_CODE>");
								resMap.put("c_service_code", cservicecode);
							}
						}
						if (basobj.containsKey("c_multi_app_flag")) {
							String cmultiappflag = basobj
									.getString("c_multi_app_flag");
							if (StringUtils.isNotEmpty(cmultiappflag)) {
								sb.append("<C_MULTI_APP_FLAG>");
								sb.append(cmultiappflag);
								sb.append("</C_MULTI_APP_FLAG>");
							}else{
								sb.append("<C_MULTI_APP_FLAG>");
								sb.append("2");
								sb.append("</C_MULTI_APP_FLAG>");
							}
						}
						if (basobj.containsKey("c_calculation_flag") && !isTpf) {
							String ccalculationflag = basobj
									.getString("c_calculation_flag");
							if (StringUtils.isNotEmpty(ccalculationflag)) {
								sb.append("<C_CALCULATION_FLAG>");
								sb.append(ccalculationflag);
								sb.append("</C_CALCULATION_FLAG>");
							}else{
								sb.append("<C_CALCULATION_FLAG>");
								sb.append("A01");
								sb.append("</C_CALCULATION_FLAG>");
							}
						}
						if (basobj.containsKey("c_dispt_sttl_org")) {
							String cdisptsttlorg = basobj
									.getString("c_dispt_sttl_org");
							if (StringUtils.isNotEmpty(cdisptsttlorg)) {
								sb.append("<C_DISPT_STTL_ORG>");
								sb.append(cdisptsttlorg);
								sb.append("</C_DISPT_STTL_ORG>");
							}
						}
						if (basobj.containsKey("c_prod_type") && !isTpf) {
							String cprodtype = basobj.getString("c_prod_type");
							if (StringUtils.isNotEmpty(cprodtype)) {
								sb.append("<C_PROD_TYPE>");
								sb.append(cprodtype);
								sb.append("</C_PROD_TYPE>");
							}
						}
						if (basobj.containsKey("c_ply_dpt_cde") && !isTpf) {
							String cplydptcde = basobj.getString("c_ply_dpt_cde");
							if (StringUtils.isNotEmpty(cplydptcde)) {
								sb.append("<C_PLY_DPT_CDE>");
								sb.append(cplydptcde);
								sb.append("</C_PLY_DPT_CDE>");
							}else{
								if(StringUtils.isNotEmpty(cdptcde) && cdptcde.length() >6){
									sb.append("<C_PLY_DPT_CDE>");
									sb.append(cdptcde.substring(0, 6));
									sb.append("</C_PLY_DPT_CDE>");
								}
								
							}
						}
						if("V7203".equals(transtype)){//新增投保必须这个标签
							sb.append("<C_APP_NO>");
							sb.append("</C_APP_NO>");
						}else{
							if (basobj.containsKey("c_app_no")) {
								String cappno = basobj.getString("c_app_no");
								if (StringUtils.isNotEmpty(cappno)) {
									sb.append("<C_APP_NO>");
									sb.append(cappno);
									sb.append("</C_APP_NO>");
								}
							}
						}
						
						if (basobj.containsKey("c_computer_ip")) {
							String ccomputerip = basobj.getString("c_computer_ip");
							if (StringUtils.isNotEmpty(ccomputerip)) {
								sb.append("<C_COMPUTER_IP>");
								sb.append(ccomputerip);
								sb.append("</C_COMPUTER_IP>");
							}
						}
						if (basobj.containsKey("t_opr_tm")) {
							String toprtm = basobj.getString("t_opr_tm");
							if (StringUtils.isNotEmpty(toprtm)) {
								sb.append("<T_OPR_TM>");
								sb.append(toprtm);
								sb.append("</T_OPR_TM>");
							}
						}
						if (basobj.containsKey("c_appoint_area_cde")) {
							String cappointareacde = basobj
									.getString("c_appoint_area_cde");
							if (StringUtils.isNotEmpty(cappointareacde)) {
								sb.append("<C_APPOINT_AREA_CDE>");
								sb.append(cappointareacde);
								sb.append("</C_APPOINT_AREA_CDE>");
							}
						}
						if (basobj.containsKey("c_offer_plan") && !isTpf) {
							String cofferplan = basobj.getString("c_offer_plan");
							if (StringUtils.isNotEmpty(cofferplan)) {
								sb.append("<C_OFFER_PLAN>");
								sb.append(cofferplan);
								sb.append("</C_OFFER_PLAN>");
							}else{
								sb.append("<C_OFFER_PLAN>");
								sb.append("B");
								sb.append("</C_OFFER_PLAN>");
							}
						}
						if (basobj.containsKey("n_rate_product") && !isTpf) {
							String nrateproduct = basobj.getString("n_rate_product");
							if (StringUtils.isNotEmpty(nrateproduct)) {
								sb.append("<N_RATE_PRODUCT>");
								sb.append(nrateproduct);
								sb.append("</N_RATE_PRODUCT>");
							}
						}
						if (basobj.containsKey("c_system_flag")) {
							String csystemflag = basobj.getString("c_system_flag");
							if (StringUtils.isNotEmpty(csystemflag)) {
								sb.append("<C_SYSTEM_FLAG>");
								sb.append(csystemflag);
								sb.append("</C_SYSTEM_FLAG>");
							}else{
								sb.append("<C_SYSTEM_FLAG>");
								sb.append("K");
								sb.append("</C_SYSTEM_FLAG>");
							}
						}
						if (basobj.containsKey("sin_channel_nam")) {
							String sinchannelnam = basobj.getString("sin_channel_nam");
							if (StringUtils.isNotEmpty(sinchannelnam)) {
								sb.append("<SIN_CHANNEL_NAM>");
								sb.append(sinchannelnam);
								sb.append("</SIN_CHANNEL_NAM>");
							}
						}
						if (basobj.containsKey("c_disp_sttl_code")) {
							String cdispsttlcode = basobj
									.getString("c_disp_sttl_code");
							if (StringUtils.isNotEmpty(cdispsttlcode)) {
								sb.append("<C_DISP_STTL_CODE>");
								sb.append(cdispsttlcode);
								sb.append("</C_DISP_STTL_CODE>");
							}
						}
						if (basobj.containsKey("n_offline_ncd")) {
							String nofflinencd = basobj.getString("n_offline_ncd");
							if (StringUtils.isNotEmpty(nofflinencd)) {
								sb.append("<N_OFFLINE_NCD>");
								sb.append(nofflinencd);
								sb.append("</N_OFFLINE_NCD>");
							}
						}
						if (basobj.containsKey("c_conti_offer_mrk")) {
							String ccontioffermrk = basobj
									.getString("c_conti_offer_mrk");
							if (StringUtils.isNotEmpty(ccontioffermrk)) {
								sb.append("<C_CONTI_OFFER_MRK>");
								sb.append(ccontioffermrk);
								sb.append("</C_CONTI_OFFER_MRK>");
							}
						}
						if (basobj.containsKey("c_brkr_nme")) {
							String cbrkrnme = basobj.getString("c_brkr_nme");
							if (StringUtils.isNotEmpty(cbrkrnme)) {
								sb.append("<C_BRKR_NME>");
								sb.append(cbrkrnme);
								sb.append("</C_BRKR_NME>");
							}
						}
						if (basobj.containsKey("n_comm_add_tax_rate")) {
							String ncommaddtaxrate = basobj
									.getString("n_comm_add_tax_rate");
							if (StringUtils.isNotEmpty(ncommaddtaxrate)) {
								sb.append("<N_COMM_ADD_TAX_RATE>");
								sb.append(ncommaddtaxrate);
								sb.append("</N_COMM_ADD_TAX_RATE>");
							}
						}
						if (basobj.containsKey("c_third_bussiness")) {
							String cthirdbussiness = basobj
									.getString("c_third_bussiness");
							if (StringUtils.isNotEmpty(cthirdbussiness)) {
								sb.append("<C_THIRD_BUSSINESS>");
								sb.append(cthirdbussiness);
								sb.append("</C_THIRD_BUSSINESS>");
							}else{
								sb.append("<C_THIRD_BUSSINESS>");
								sb.append("0");
								sb.append("</C_THIRD_BUSSINESS>");
							}
						}
						if (basobj.containsKey("c_cha_subtype")) {
							String cchasubtype = basobj
									.getString("c_cha_subtype");
							if (StringUtils.isNotEmpty(cchasubtype)) {
								sb.append("<C_CHA_SUBTYPE>");
								sb.append(cchasubtype);
								sb.append("</C_CHA_SUBTYPE>");
							}
						}
						if (basobj.containsKey("c_new_bsns_typ")) {
							String cnewbsnstyp = basobj
									.getString("c_new_bsns_typ");
							if(StringUtils.isEmpty(cnewbsnstyp)){
								cnewbsnstyp = basobj
										.getString("c_bsns_typ");
							}
							if (StringUtils.isNotEmpty(cnewbsnstyp)) {
								sb.append("<C_NEW_BSNS_TYP>");
								sb.append(cnewbsnstyp);
								sb.append("</C_NEW_BSNS_TYP>");
							}
							
							resMap.put("c_new_bsns_typ", cnewbsnstyp);
						}
						if (basobj.containsKey("c_record_code")) {
							String crecordcode = basobj.getString("c_record_code");
							if (StringUtils.isNotEmpty(crecordcode)) {
								sb.append("<C_RECORD_CODE>");
								sb.append(crecordcode);
								sb.append("</C_RECORD_CODE>");
							}
						}
						if (basobj.containsKey("c_usb_key")) {
							String cusbkey = basobj.getString("c_usb_key");
							if (StringUtils.isNotEmpty(cusbkey)) {
								sb.append("<C_USB_KEY>");
								sb.append(cusbkey);
								sb.append("</C_USB_KEY>");
							}
						}
						if (basobj.containsKey("c_agant_per")) {
							String cagantper = basobj.getString("c_agant_per");
							if (StringUtils.isNotEmpty(cagantper)) {
								sb.append("<C_AGANT_PER>");
								sb.append(cagantper);
								sb.append("</C_AGANT_PER>");
							}
						}
						if (basobj.containsKey("c_sls_id")) {
							String cslsid = basobj.getString("c_sls_id");
							if (StringUtils.isNotEmpty(cslsid)) {
								sb.append("<C_SLS_ID>");
								sb.append(cslsid);
								sb.append("</C_SLS_ID>");
							}
						}
						if (basobj.containsKey("c_pos_no")) {
							String cposno = basobj.getString("c_pos_no");
							if (StringUtils.isNotEmpty(cposno)) {
								sb.append("<C_POS_NO>");
								sb.append(cposno);
								sb.append("</C_POS_NO>");
							}
						}
						if (basobj.containsKey("c_plate_no")) {
							String cplateno = basobj.getString("c_plate_no");
							if (StringUtils.isNotEmpty(cplateno)) {
								sb.append("<C_PLATE_NO>");
								sb.append(cplateno);
								sb.append("</C_PLATE_NO>");
							}
							resMap.put("cplateno", cplateno);
						}
						if (basobj.containsKey("c_plate_typ")) {
							String cplatetyp = basobj.getString("c_plate_typ");
							if (StringUtils.isNotEmpty(cplatetyp)) {
								sb.append("<C_PLATE_TYP>");
								sb.append(cplatetyp);
								sb.append("</C_PLATE_TYP>");
							}
						}
						if (basobj.containsKey("c_frm_no")) {
							String cfrmno = basobj.getString("c_frm_no");
							if (StringUtils.isNotEmpty(cfrmno)) {
								sb.append("<C_FRM_NO>");
								sb.append(cfrmno);
								sb.append("</C_FRM_NO>");
							}
						}
						
						if (basobj.containsKey("c_conti_mrk")) {
							String c_conti_mrk = basobj.getString("c_conti_mrk");
							if (StringUtils.isNotEmpty(c_conti_mrk)) {
								sb.append("<C_CONTI_MRK>");
								sb.append(c_conti_mrk);
								sb.append("</C_CONTI_MRK>");
							}
						}
						
						if (basobj.containsKey("c_eng_no")) {
							String cengno = basobj.getString("c_eng_no");
							if (StringUtils.isNotEmpty(cengno)) {
								sb.append("<C_ENG_NO>");
								sb.append(cengno);
								sb.append("</C_ENG_NO>");
							}
						}
						if (basobj.containsKey("c_fin_typ")) {
							String cfintyp = basobj.getString("c_fin_typ");
							if (StringUtils.isNotEmpty(cfintyp)) {
								sb.append("<C_FIN_TYP>");
								sb.append(cfintyp);
								sb.append("</C_FIN_TYP>");
							}
						}
						if (basobj.containsKey("c_unfix_spc")) {
							String cunfixspc = basobj.getString("c_unfix_spc");
							if (StringUtils.isNotEmpty(cunfixspc)) {
								sb.append("<C_UNFIX_SPC>");
								sb.append(cunfixspc);
								sb.append("</C_UNFIX_SPC>");
							}
						}
						if (basobj.containsKey("c_dispt_sttl_cde")) {
							String cdisptsttlcde = basobj.getString("c_dispt_sttl_cde");
							if (StringUtils.isNotEmpty(cdisptsttlcde)) {
								sb.append("<C_DISPT_STTL_CDE>");
								sb.append(cdisptsttlcde);
								sb.append("</C_DISPT_STTL_CDE>");
							}
						}
						if (basobj.containsKey("c_ratio_typ")) {
							String cratiotyp = basobj.getString("c_ratio_typ");
							if (StringUtils.isNotEmpty(cratiotyp)) {
								sb.append("<C_RATIO_TYP>");
								sb.append(cratiotyp);
								sb.append("</C_RATIO_TYP>");
							}
						}
						if (basobj.containsKey("n_amt")) {
							String namt = basobj.getString("n_amt");
							if (StringUtils.isNotEmpty(namt)) {
								sb.append("<N_AMT>");
								sb.append(namt);
								sb.append("</N_AMT>");
							}
						}
						if (basobj.containsKey("n_prm")) {
							String nprm = basobj.getString("n_prm");
							if (StringUtils.isNotEmpty(nprm)) {
								sb.append("<N_PRM>");
								sb.append(nprm);
								sb.append("</N_PRM>");
							}
						}
						if (basobj.containsKey("n_comm_rate")) {
							String ncommrate = basobj.getString("n_comm_rate");
							if (StringUtils.isNotEmpty(ncommrate)) {
								sb.append("<N_COMM_RATE>");
								sb.append(ncommrate);
								sb.append("</N_COMM_RATE>");
							}
						}
						if (basobj.containsKey("c_ratio_coef")) {
							String cratiocoef = basobj.getString("c_ratio_coef");
							if (StringUtils.isNotEmpty(cratiocoef)) {
								sb.append("<C_RATIO_COEF>");
								sb.append(cratiocoef);
								sb.append("</C_RATIO_COEF>");
							}
						}
						if (basobj.containsKey("c_check_status")) {
							String cCheckStatus = basobj.getString("c_check_status");
							if (StringUtils.isNotEmpty(cCheckStatus)) {
								sb.append("<C_CHECK_STATUS>");
								sb.append(cCheckStatus);
								sb.append("</C_CHECK_STATUS>");
							}
						}
						if (basobj.containsKey("c_vhlowner_cde")) {
							String cVhlownerCde = basobj.getString("c_vhlowner_cde");
							if (StringUtils.isNotEmpty(cVhlownerCde)) {
								sb.append("<C_VHLOWNER_CDE>");
								sb.append(cVhlownerCde);
								sb.append("</C_VHLOWNER_CDE>");
							}
						}
						sb.append("</BASE_PART>");
					}
				}
				
				//**********************************************************************************************************	
				if (bodyobj.containsKey("vehicle")) {
					JSONObject vicobj = bodyobj.getJSONObject("vehicle");
					if (!vicobj.isNullObject()) {

						sb.append("<VEHICLE>");
						if (vicobj.containsKey("c_plate_no")) {
							String cplateno = vicobj.getString("c_plate_no");
							if (StringUtils.isNotEmpty(cplateno)) {
								sb.append("<C_PLATE_NO>");
								sb.append(cplateno);
								sb.append("</C_PLATE_NO>");
							}else{
								sb.append("<C_PLATE_NO>");
								sb.append("*-*");
								sb.append("</C_PLATE_NO>");	
							}
						}
						if (vicobj.containsKey("c_car_name")) {
							String ccarname = vicobj.getString("c_car_name");
							if (StringUtils.isNotEmpty(ccarname)) {
								sb.append("<C_CAR_NAME>");
								sb.append(ccarname);
								sb.append("</C_CAR_NAME>");
							}
						} 
						
						if (vicobj.containsKey("c_mon_desp_rate")) {
							String c_mon_desp_rate = vicobj.getString("c_mon_desp_rate");
							if (StringUtils.isNotEmpty(c_mon_desp_rate)) {
								sb.append("<C_MON_DESP_RATE>");
								sb.append(c_mon_desp_rate);
								sb.append("</C_MON_DESP_RATE>");
							}
						}
						
						if (vicobj.containsKey("c_check_time")) {
							String c_check_time = vicobj.getString("c_check_time");
							if (StringUtils.isNotEmpty(c_check_time)) {
								sb.append("<C_CHECK_TIME>");
								sb.append(c_check_time);
								sb.append("</C_CHECK_TIME>");
							}
						}
						
						if (vicobj.containsKey("c_prov_num")) {
							String cprovnum = vicobj.getString("c_prov_num");
							if (StringUtils.isNotEmpty(cprovnum)) {
								sb.append("<C_PROV_NUM>");
								sb.append(cprovnum);
								sb.append("</C_PROV_NUM>");
							}
						}
						if (vicobj.containsKey("c_industry_model_code")) {
							String cindustrymodelcode = vicobj.getString("c_industry_model_code");
							if (StringUtils.isNotEmpty(cindustrymodelcode)) {
								sb.append("<C_INDUSTRY_MODEL_CODE>");
								sb.append(cindustrymodelcode);
								sb.append("</C_INDUSTRY_MODEL_CODE>");
							}
						}
						if (vicobj.containsKey("c_industry_model_name")) {
							String cindustrymodelname = vicobj.getString("c_industry_model_name");
							if (StringUtils.isNotEmpty(cindustrymodelname)) {
								sb.append("<C_INDUSTRY_MODEL_NAME>");
								sb.append(cindustrymodelname);
								sb.append("</C_INDUSTRY_MODEL_NAME>");
							}
						}
						if (vicobj.containsKey("c_brand_id")) {
							String cbrandid = vicobj.getString("c_brand_id");
							if (StringUtils.isNotEmpty(cbrandid)) {
								sb.append("<C_BRAND_ID>");
								sb.append(cbrandid);
								sb.append("</C_BRAND_ID>");
							}
						}
						if (vicobj.containsKey("c_notice_type")) {
							String cnoticetype = vicobj.getString("c_notice_type");
							if (StringUtils.isNotEmpty(cnoticetype)) {
								sb.append("<C_NOTICE_TYPE>");
								sb.append(cnoticetype);
								sb.append("</C_NOTICE_TYPE>");
							}
						}
						if (vicobj.containsKey("c_qry_cde")) {
							String cqrycde = vicobj.getString("c_qry_cde");
							if (StringUtils.isNotEmpty(cqrycde)) {
								sb.append("<C_QRY_CDE>");
								sb.append(cqrycde);
								sb.append("</C_QRY_CDE>");
							}
						}
						if (vicobj.containsKey("c_plate_typ")) {
							String cplatetyp = vicobj.getString("c_plate_typ");
							if (StringUtils.isNotEmpty(cplatetyp)) {
								sb.append("<C_PLATE_TYP>");
								sb.append(cplatetyp);
								sb.append("</C_PLATE_TYP>");
							}
						}
						if (vicobj.containsKey("c_new_mrk")) {
							String cnewmrk = vicobj.getString("c_new_mrk");
							if (StringUtils.isNotEmpty(cnewmrk)) {
								sb.append("<C_NEW_MRK>");
								sb.append(cnewmrk);
								sb.append("</C_NEW_MRK>");
							}
						}
						if (vicobj.containsKey("c_ecdemic_mrk")) {
							String cecdemicmrk = vicobj.getString("c_ecdemic_mrk");
							if (StringUtils.isNotEmpty(cecdemicmrk)) {
								sb.append("<C_ECDEMIC_MRK>");
								sb.append(cecdemicmrk);
								sb.append("</C_ECDEMIC_MRK>");
							}
						}
						if (vicobj.containsKey("c_new_vhl_flag")) {
							String cnewvhlflag = vicobj.getString("c_new_vhl_flag");
							if (StringUtils.isNotEmpty(cnewvhlflag)) {
								sb.append("<C_NEW_VHL_FLAG>");
								sb.append(cnewvhlflag);
								sb.append("</C_NEW_VHL_FLAG>");
							}
						}
						if (vicobj.containsKey("c_device_1_mrk")) {
							String cdevice1mrk = vicobj.getString("c_device_1_mrk");
							if (StringUtils.isNotEmpty(cdevice1mrk)) {
								sb.append("<C_DEVICE_1_MRK>");
								sb.append(cdevice1mrk);
								sb.append("</C_DEVICE_1_MRK>");
							}
						}
						if (vicobj.containsKey("c_fst_reg_ym")) {
							String cfstregym = vicobj.getString("c_fst_reg_ym");
							if (StringUtils.isNotEmpty(cfstregym)) {
								sb.append("<C_FST_REG_YM>");
								sb.append(cfstregym);
								sb.append("</C_FST_REG_YM>");
							}
						}
						if (vicobj.containsKey("c_frm_no")) {
							String cfrmno = vicobj.getString("c_frm_no");
							if (StringUtils.isNotEmpty(cfrmno)) {
								sb.append("<C_FRM_NO>");
								sb.append(cfrmno);
								sb.append("</C_FRM_NO>");
							}
						}
						if (vicobj.containsKey("c_vin")) {
							String cvin = vicobj.getString("c_vin");
							if (StringUtils.isNotEmpty(cvin)) {
								sb.append("<C_VIN>");
								sb.append(cvin);
								sb.append("</C_VIN>");
							}
						}
						if (vicobj.containsKey("c_eng_no")) {
							String cengno = vicobj.getString("c_eng_no");
							if (StringUtils.isNotEmpty(cengno)) {
								sb.append("<C_ENG_NO>");
								sb.append(cengno);
								sb.append("</C_ENG_NO>");
							}
						}
						if (vicobj.containsKey("c_plate_color")) {
							String cplatecolor = vicobj.getString("c_plate_color");
							if (StringUtils.isNotEmpty(cplatecolor)) {
								sb.append("<C_PLATE_COLOR>");
								sb.append(cplatecolor);
								sb.append("</C_PLATE_COLOR>");
							}
						}
						if (vicobj.containsKey("c_special_mrk")) {
							String cspecialmrk = vicobj.getString("c_special_mrk");
							if (StringUtils.isNotEmpty(cspecialmrk)) {
								sb.append("<C_SPECIAL_MRK>");
								sb.append(cspecialmrk);
								sb.append("</C_SPECIAL_MRK>");
							}
						}
						if (vicobj.containsKey("c_use_year")) {
							String cuseyear = vicobj.getString("c_use_year");
							if (StringUtils.isNotEmpty(cuseyear)) {
								sb.append("<C_USE_YEAR>");
								sb.append(cuseyear);
								sb.append("</C_USE_YEAR>");
							}
						}
						if (vicobj.containsKey("c_year_run_mil")) {
							String cyearrunmil = vicobj.getString("c_year_run_mil");
							if (StringUtils.isNotEmpty(cyearrunmil)) {
								sb.append("<C_YEAR_RUN_MIL>");
								sb.append(cyearrunmil);
								sb.append("</C_YEAR_RUN_MIL>");
							}
						}
						if (vicobj.containsKey("c_travel_area_cde")) {
							String ctravelareacde = vicobj.getString("c_travel_area_cde");
							if (StringUtils.isNotEmpty(ctravelareacde)) {
								sb.append("<C_TRAVEL_AREA_CDE>");
								sb.append(ctravelareacde);
								sb.append("</C_TRAVEL_AREA_CDE>");
							}
						}
						if (vicobj.containsKey("c_plate_brand_id")) {
							String cplatebrandid = vicobj.getString("c_plate_brand_id");
							if (StringUtils.isNotEmpty(cplatebrandid)) {
								sb.append("<C_PLATE_BRAND_ID>");
								sb.append(cplatebrandid);
								sb.append("</C_PLATE_BRAND_ID>");
							}
						}
						if (vicobj.containsKey("c_model_nme")) {
							String cmodelnme = vicobj.getString("c_model_nme");
							if (StringUtils.isNotEmpty(cmodelnme)) {
								sb.append("<C_MODEL_NME>");
								sb.append(cmodelnme);
								sb.append("</C_MODEL_NME>");
							}
						}
						if (vicobj.containsKey("c_usage_cde")) {
							String cusagecde = vicobj.getString("c_usage_cde");
							if (StringUtils.isNotEmpty(cusagecde)) {
								sb.append("<C_USAGE_CDE>");
								sb.append(cusagecde);
								sb.append("</C_USAGE_CDE>");
								resMap.put("c_usage_cde", cusagecde);
							}
						}
						if (vicobj.containsKey("c_vhl_typ")) {
							String cvhltyp = vicobj.getString("c_vhl_typ");
							if (StringUtils.isNotEmpty(cvhltyp)) {
								sb.append("<C_VHL_TYP>");
								sb.append(cvhltyp);
								sb.append("</C_VHL_TYP>");
							}
						}
						if (vicobj.containsKey("c_mfg_year")) {
							String cmfgyear = vicobj.getString("c_mfg_year");
							if (StringUtils.isNotEmpty(cmfgyear)) {
								sb.append("<C_MFG_YEAR>");
								sb.append(cmfgyear);
								sb.append("</C_MFG_YEAR>");
							}
						}
						if (vicobj.containsKey("n_seat_num")) {
							String nseatnum = vicobj.getString("n_seat_num");
							if (StringUtils.isNotEmpty(nseatnum)) {
								sb.append("<N_SEAT_NUM>");
								sb.append(nseatnum);
								sb.append("</N_SEAT_NUM>");
							}
						}
						if (vicobj.containsKey("n_tonage")) {
							String ntonage = vicobj.getString("n_tonage");
							if (StringUtils.isNotEmpty(ntonage)) {
								sb.append("<N_TONAGE>");
								sb.append(ntonage);
								sb.append("</N_TONAGE>");
							}
						}
						if (vicobj.containsKey("n_displacement")) {
							String ndisplacement = vicobj.getString("n_displacement");
							if (StringUtils.isNotEmpty(ndisplacement)) {
								sb.append("<N_DISPLACEMENT>");
								sb.append(ndisplacement);
								sb.append("</N_DISPLACEMENT>");
							}
						}
						if (vicobj.containsKey("n_po_weight")) {
							String npoweight = vicobj.getString("n_po_weight");
							if (StringUtils.isNotEmpty(npoweight)) {
								sb.append("<N_PO_WEIGHT>");
								sb.append(npoweight);
								sb.append("</N_PO_WEIGHT>");
							}
						}
						if (vicobj.containsKey("c_displacement_lvl")) {
							String cdisplacementlvl = vicobj.getString("c_displacement_lvl");
							if (StringUtils.isNotEmpty(cdisplacementlvl)) {
								sb.append("<C_DISPLACEMENT_LVL>");
								sb.append(cdisplacementlvl);
								sb.append("</C_DISPLACEMENT_LVL>");
							}
						}
						if (vicobj.containsKey("c_safety_device")) {
							String csafetydevice = vicobj.getString("c_safety_device");
							if (StringUtils.isNotEmpty(csafetydevice)) {
								sb.append("<C_SAFETY_DEVICE>");
								sb.append(csafetydevice);
								sb.append("</C_SAFETY_DEVICE>");
							}
						}
						if (vicobj.containsKey("c_stop_site")) {
							String cstopsite = vicobj.getString("c_stop_site");
							if (StringUtils.isNotEmpty(cstopsite)) {
								sb.append("<C_STOP_SITE>");
								sb.append(cstopsite);
								sb.append("</C_STOP_SITE>");
							}
						}
						if (vicobj.containsKey("c_new_purchase_value")) {
							String cnewpurchasevalue = vicobj.getString("c_new_purchase_value");
							if (StringUtils.isNotEmpty(cnewpurchasevalue)) {
								sb.append("<C_NEW_PURCHASE_VALUE>");
								sb.append(cnewpurchasevalue);
								sb.append("</C_NEW_PURCHASE_VALUE>");
							}
						}
						if (vicobj.containsKey("c_made_factory")) {
							String cmadefactory = vicobj.getString("c_made_factory");
							if (StringUtils.isNotEmpty(cmadefactory)) {
								sb.append("<C_MADE_FACTORY>");
								sb.append(cmadefactory);
								sb.append("</C_MADE_FACTORY>");
							}
						}
						if (vicobj.containsKey("c_fuel_type")) {
							String cfueltype = vicobj.getString("c_fuel_type");
							if (StringUtils.isNotEmpty(cfueltype)) {
								sb.append("<C_FUEL_TYPE>");
								sb.append(cfueltype);
								sb.append("</C_FUEL_TYPE>");
							}
						}
						if (vicobj.containsKey("c_model_cde")) {
							String cmodelcde = vicobj.getString("c_model_cde");
							if (StringUtils.isNotEmpty(cmodelcde)) {
								sb.append("<C_MODEL_CDE>");
								sb.append(cmodelcde);
								sb.append("</C_MODEL_CDE>");
							}
						}
						if (vicobj.containsKey("c_model_cde_2")) {
							String cmodelcde2 = vicobj.getString("c_model_cde_2");
							if (StringUtils.isNotEmpty(cmodelcde2)) {
								sb.append("<C_MODEL_CDE_2>");
								sb.append(cmodelcde2);
								sb.append("</C_MODEL_CDE_2>");
							}
						}
						if (vicobj.containsKey("c_prod_place")) {
							String cprodplace = vicobj.getString("c_prod_place");
							if (StringUtils.isNotEmpty(cprodplace)) {
								sb.append("<C_PROD_PLACE>");
								sb.append(cprodplace);
								sb.append("</C_PROD_PLACE>");
							}
						}
						if (vicobj.containsKey("c_body_color")) {
							String cbodycolor = vicobj.getString("c_body_color");
							if (StringUtils.isNotEmpty(cbodycolor)) {
								sb.append("<C_BODY_COLOR>");
								sb.append(cbodycolor);
								sb.append("</C_BODY_COLOR>");
							}
						}
						if (vicobj.containsKey("c_reg_dri_typ")) {
							String cregdrityp = vicobj.getString("c_reg_dri_typ");
							if (StringUtils.isNotEmpty(cregdrityp)) {
								sb.append("<C_REG_DRI_TYP>");
								sb.append(cregdrityp);
								sb.append("</C_REG_DRI_TYP>");
							}
						}
						if (vicobj.containsKey("c_reg_vhl_typ")) {
							String cregvhltyp = vicobj.getString("c_reg_vhl_typ");
							if (StringUtils.isNotEmpty(cregvhltyp)) {
								sb.append("<C_REG_VHL_TYP>");
								sb.append(cregvhltyp);
								sb.append("</C_REG_VHL_TYP>");
							}
						}
						if (vicobj.containsKey("c_loan_vehicle_flag")) {
							String cloanvehicleflag = vicobj.getString("c_loan_vehicle_flag");
							if (StringUtils.isNotEmpty(cloanvehicleflag)) {
								sb.append("<C_LOAN_VEHICLE_FLAG>");
								sb.append(cloanvehicleflag);
								sb.append("</C_LOAN_VEHICLE_FLAG>");
							}
						}
						if (vicobj.containsKey("c_car_age")) {
							String ccarage = vicobj.getString("c_car_age");
							if (StringUtils.isNotEmpty(ccarage)) {
								sb.append("<C_CAR_AGE>");
								sb.append(ccarage);
								sb.append("</C_CAR_AGE>");
							}
						}
						if (vicobj.containsKey("c_drv_lcn_issue_date")) {
							String cdrvlcnissuedate = vicobj.getString("c_drv_lcn_issue_date");
							if (StringUtils.isNotEmpty(cdrvlcnissuedate)) {
								sb.append("<C_DRV_LCN_ISSUE_DATE>");
								sb.append(cdrvlcnissuedate);
								sb.append("</C_DRV_LCN_ISSUE_DATE>");
							}
						}
						if (vicobj.containsKey("c_last_year_clm_tms")) {
							String clastyearclmtms = vicobj.getString("c_last_year_clm_tms");
							if (StringUtils.isNotEmpty(clastyearclmtms)) {
								sb.append("<C_LAST_YEAR_CLM_TMS>");
								sb.append(clastyearclmtms);
								sb.append("</C_LAST_YEAR_CLM_TMS>");
							}
						}
						if (vicobj.containsKey("c_glass_typ")) {
							String cglasstyp = vicobj.getString("c_glass_typ");
							if (StringUtils.isNotEmpty(cglasstyp)) {
								sb.append("<C_GLASS_TYP>");
								sb.append(cglasstyp);
								sb.append("</C_GLASS_TYP>");
							}
						}
						if (vicobj.containsKey("t_transfer_tm")) {
							String ttransfertm = vicobj.getString("t_transfer_tm");
							if (StringUtils.isNotEmpty(ttransfertm)) {
								sb.append("<T_TRANSFER_TM>");
								sb.append(ttransfertm);
								sb.append("</T_TRANSFER_TM>");
							}
						}
						if (vicobj.containsKey("c_change_flag")) {
							String cchangeflag = vicobj.getString("c_change_flag");
							if (StringUtils.isNotEmpty(cchangeflag)) {
								sb.append("<C_CHANGE_FLAG>");
								sb.append(cchangeflag);
								sb.append("</C_CHANGE_FLAG>");
							}
						}
						if (vicobj.containsKey("c_power_type")) {
							String cpowertype = vicobj.getString("c_power_type");
							if (StringUtils.isNotEmpty(cpowertype)) {
								sb.append("<C_POWER_TYPE>");
								sb.append(cpowertype);
								sb.append("</C_POWER_TYPE>");
							}
						}
						if (vicobj.containsKey("c_careful_date")) {
							String ccarefuldate = vicobj.getString("c_careful_date");
							if (StringUtils.isNotEmpty(ccarefuldate)) {
								sb.append("<C_CAREFUL_DATE>");
								sb.append(ccarefuldate);
								sb.append("</C_CAREFUL_DATE>");
							}
						}
						if (vicobj.containsKey("c_inspect_rec")) {
							String cinspectrec = vicobj.getString("c_inspect_rec");
							if (StringUtils.isNotEmpty(cinspectrec)) {
								sb.append("<C_INSPECT_REC>");
								sb.append(cinspectrec);
								sb.append("</C_INSPECT_REC>");
							}
						}
						if (vicobj.containsKey("t_inspect_tm")) {
							String tinspecttm = vicobj.getString("t_inspect_tm");
							if (StringUtils.isNotEmpty(tinspecttm)) {
								sb.append("<T_INSPECT_TM>");
								sb.append(tinspecttm);
								sb.append("</T_INSPECT_TM>");
							}
						}
						if (vicobj.containsKey("c_car_by_city")) {
							String ccarbycity = vicobj.getString("c_car_by_city");
							if (StringUtils.isNotEmpty(ccarbycity)) {
								sb.append("<C_CAR_BY_CITY>");
								sb.append(ccarbycity);
								sb.append("</C_CAR_BY_CITY>");
							}
						}
						if (vicobj.containsKey("c_car_by_area")) {
							String ccarbyarea = vicobj.getString("c_car_by_area");
							if (StringUtils.isNotEmpty(ccarbyarea)) {
								sb.append("<C_CAR_BY_AREA>");
								sb.append(ccarbyarea);
								sb.append("</C_CAR_BY_AREA>");
							}
						}
						if (vicobj.containsKey("c_nat_of_busines")) {
							String cnatofbusines = vicobj.getString("c_nat_of_busines");
							if (StringUtils.isNotEmpty(cnatofbusines)) {
								sb.append("<C_NAT_OF_BUSINES>");
								sb.append(cnatofbusines);
								sb.append("</C_NAT_OF_BUSINES>");
							}
						}
						if (vicobj.containsKey("c_resv_txt_6")) {
							String cresvtxt6 = vicobj.getString("c_resv_txt_6");
							if (StringUtils.isNotEmpty(cresvtxt6)) {
								sb.append("<C_RESV_TXT_6>");
								sb.append(cresvtxt6);
								sb.append("</C_RESV_TXT_6>");
							}
						}
						if (vicobj.containsKey("c_fleet_mrk")) {
							String cfleetmrk = vicobj.getString("c_fleet_mrk");
							if (StringUtils.isNotEmpty(cfleetmrk)) {
								sb.append("<C_FLEET_MRK>");
								sb.append(cfleetmrk);
								sb.append("</C_FLEET_MRK>");
							}
						}
						if (vicobj.containsKey("c_vhl_pkg_no")) {
							String cvhlpkgno = vicobj.getString("c_vhl_pkg_no");
							if (StringUtils.isNotEmpty(cvhlpkgno)) {
								sb.append("<C_VHL_PKG_NO>");
								sb.append(cvhlpkgno);
								sb.append("</C_VHL_PKG_NO>");
							}
						}
						if (vicobj.containsKey("n_discuss_actual_value")) {
							String ndiscussactualvalue = vicobj.getString("n_discuss_actual_value");
							if (StringUtils.isNotEmpty(ndiscussactualvalue)) {
								sb.append("<N_DISCUSS_ACTUAL_VALUE>");
								sb.append(ndiscussactualvalue);
								sb.append("</N_DISCUSS_ACTUAL_VALUE>");
							}
						}
						if (vicobj.containsKey("c_model_id_code")) {
							String cmodelidcode = vicobj.getString("c_model_id_code");
							if (StringUtils.isNotEmpty(cmodelidcode)) {
								sb.append("<C_MODEL_ID_CODE>");
								sb.append(cmodelidcode);
								sb.append("</C_MODEL_ID_CODE>");
							}
						}
						if (vicobj.containsKey("t_poli_find_date")) {
							String tpolifinddate = vicobj.getString("t_poli_find_date");
							if (StringUtils.isNotEmpty(tpolifinddate)) {
								sb.append("<T_POLI_FIND_DATE>");
								sb.append(tpolifinddate);
								sb.append("</T_POLI_FIND_DATE>");
							}
						}
						if (vicobj.containsKey("c_family_code")) {
							String cfamilycode = vicobj.getString("c_family_code");
							if (StringUtils.isNotEmpty(cfamilycode)) {
								sb.append("<C_FAMILY_CODE>");
								sb.append(cfamilycode);
								sb.append("</C_FAMILY_CODE>");
							}
						}
						if (vicobj.containsKey("c_inspect_tm")) {
							String cinspecttm = vicobj.getString("c_inspect_tm");
							if (StringUtils.isNotEmpty(cinspecttm)) {
								sb.append("<C_INSPECT_TM>");
								sb.append(cinspecttm);
								sb.append("</C_INSPECT_TM>");
							}
						}
						if (vicobj.containsKey("c_pay_loan")) {
							String cpayloan = vicobj.getString("c_pay_loan");
							if (StringUtils.isNotEmpty(cpayloan)) {
								sb.append("<C_PAY_LOAN>");
								sb.append(cpayloan);
								sb.append("</C_PAY_LOAN>");
							}
						}
						if (vicobj.containsKey("c_search_code")) {
							String csearchcode = vicobj.getString("c_search_code");
							if (StringUtils.isNotEmpty(csearchcode)) {
								sb.append("<C_SEARCH_CODE>");
								sb.append(csearchcode);
								sb.append("</C_SEARCH_CODE>");
							}
						}
						if (vicobj.containsKey("n_actual_value")) {
							String nactualvalue = vicobj.getString("n_actual_value");
							if (StringUtils.isNotEmpty(nactualvalue)) {
								sb.append("<N_ACTUAL_VALUE>");
								sb.append(nactualvalue);
								sb.append("</N_ACTUAL_VALUE>");
							}
						}
						sb.append("</VEHICLE>");
					}
				}
				
	//**************************************************************************************************************************
				if (bodyobj.containsKey("vhl_info")) {
					JSONObject vhlobj = bodyobj.getJSONObject("vhl_info");
					if (!vhlobj.isNullObject() && "Y".equals(isvhl_info)) {
						if("V7203".equals(transtype) || "V7620".equals(transtype)){
							sb.append("<VEHICLE>");
						}else{
							sb.append("<VHL_INFO>");
						}
						
						if (vhlobj.containsKey("c_qry_cde")) {
							String c_qry_cde = vhlobj.getString("c_qry_cde");
							if (StringUtils.isNotEmpty(c_qry_cde)) {
								sb.append("<C_QRY_CDE>");
								sb.append(c_qry_cde);
								sb.append("</C_QRY_CDE>");
								resMap.put("c_qry_cde", c_qry_cde);
							}
						}
						if (vhlobj.containsKey("c_check_time")) {
							String c_check_time = vhlobj.getString("c_check_time");
							if (StringUtils.isNotEmpty(c_check_time)) {
								sb.append("<C_CHECK_TIME>");
								sb.append(c_check_time);
								sb.append("</C_CHECK_TIME>");
							}
						}
						
						if (vhlobj.containsKey("c_prov_num")) {
							String cprovnum = vhlobj.getString("c_prov_num");
							if (StringUtils.isNotEmpty(cprovnum)) {
								sb.append("<C_PROV_NUM>");
								sb.append(cprovnum);
								sb.append("</C_PROV_NUM>");
							}
						}
						if (vhlobj.containsKey("c_industry_model_code")) {
							String cindustrymodelcode = vhlobj.getString("c_industry_model_code");
							if (StringUtils.isNotEmpty(cindustrymodelcode)) {
								sb.append("<C_INDUSTRY_MODEL_CODE>");
								sb.append(cindustrymodelcode);
								sb.append("</C_INDUSTRY_MODEL_CODE>");
							}
						}
						
						if (vhlobj.containsKey("c_industry_model_name")) {
							String cindustrymodelname = vhlobj.getString("c_industry_model_name");
							if (StringUtils.isNotEmpty(cindustrymodelname)) {
								sb.append("<C_INDUSTRY_MODEL_NAME>");
								sb.append(cindustrymodelname);
								sb.append("</C_INDUSTRY_MODEL_NAME>");
							}
						}
						if (vhlobj.containsKey("c_brand_id")) {
							String cbrandid = vhlobj.getString("c_brand_id");
							if (StringUtils.isNotEmpty(cbrandid)) {
								sb.append("<C_BRAND_ID>");
								sb.append(cbrandid);
								sb.append("</C_BRAND_ID>");
							}
						}
						if (vhlobj.containsKey("c_notice_type")) {
							String cnoticetype = vhlobj.getString("c_notice_type");
							if (StringUtils.isNotEmpty(cnoticetype)) {
								sb.append("<C_NOTICE_TYPE>");
								sb.append(cnoticetype);
								sb.append("</C_NOTICE_TYPE>");
							}
						}
						if (vhlobj.containsKey("c_device_1_mrk")) {
							String cdevice1mrk = vhlobj.getString("c_device_1_mrk");
							if (StringUtils.isNotEmpty(cdevice1mrk)) {
								sb.append("<C_DEVICE_1_MRK>");
								sb.append(cdevice1mrk);
								sb.append("</C_DEVICE_1_MRK>");
							}
						}
						if (vhlobj.containsKey("c_fst_reg_ym")) {
							String cfstregym = vhlobj.getString("c_fst_reg_ym");
							if (StringUtils.isNotEmpty(cfstregym)) {
								sb.append("<C_FST_REG_YM>");
								sb.append(cfstregym);
								sb.append("</C_FST_REG_YM>");
							}
						}
						if (vhlobj.containsKey("c_special_mrk")) {
							String cspecialmrk = vhlobj.getString("c_special_mrk");
							if (StringUtils.isNotEmpty(cspecialmrk)) {
								sb.append("<C_SPECIAL_MRK>");
								sb.append(cspecialmrk);
								sb.append("</C_SPECIAL_MRK>");
							}
						}
						if (vhlobj.containsKey("c_year_run_mil")) {
							String cyearrunmil = vhlobj.getString("c_year_run_mil");
							if (StringUtils.isNotEmpty(cyearrunmil)) {
								sb.append("<C_YEAR_RUN_MIL>");
								sb.append(cyearrunmil);
								sb.append("</C_YEAR_RUN_MIL>");
							}
						}
						
						if (vhlobj.containsKey("c_plate_brand_id")) {
							String cplatebrandid = vhlobj.getString("c_plate_brand_id");
							if (StringUtils.isNotEmpty(cplatebrandid)) {
								sb.append("<C_PLATE_BRAND_ID>");
								sb.append(cplatebrandid);
								sb.append("</C_PLATE_BRAND_ID>");
							}
						}
						if (vhlobj.containsKey("n_seat_num")) {
							String nseatnum = vhlobj.getString("n_seat_num");
							if (StringUtils.isNotEmpty(nseatnum)) {
								sb.append("<N_SEAT_NUM>");
								sb.append(nseatnum);
								sb.append("</N_SEAT_NUM>");
							}
						}
						if (vhlobj.containsKey("c_displacement_lvl")) {
							String cdisplacementlvl = vhlobj.getString("c_displacement_lvl");
							if (StringUtils.isNotEmpty(cdisplacementlvl)) {
								sb.append("<C_DISPLACEMENT_LVL>");
								sb.append(cdisplacementlvl);
								sb.append("</C_DISPLACEMENT_LVL>");
							}
						}
						
						if (vhlobj.containsKey("c_safety_device")) {
							String csafetydevice = vhlobj.getString("c_safety_device");
							if (StringUtils.isNotEmpty(csafetydevice)) {
								sb.append("<C_SAFETY_DEVICE>");
								sb.append(csafetydevice);
								sb.append("</C_SAFETY_DEVICE>");
							}
						}
						if (vhlobj.containsKey("c_stop_site")) {
							String cstopsite = vhlobj.getString("c_stop_site");
							if (StringUtils.isNotEmpty(cstopsite)) {
								sb.append("<C_STOP_SITE>");
								sb.append(cstopsite);
								sb.append("</C_STOP_SITE>");
							}
						}
						if (vhlobj.containsKey("c_made_factory")) {
							String cmadefactory = vhlobj.getString("c_made_factory");
							if (StringUtils.isNotEmpty(cmadefactory)) {
								sb.append("<C_MADE_FACTORY>");
								sb.append(cmadefactory);
								sb.append("</C_MADE_FACTORY>");
							}
						}
					 
						if (vhlobj.containsKey("c_model_cde_2")) {
							String cmodelcde2 = vhlobj.getString("c_model_cde_2");
							if (StringUtils.isNotEmpty(cmodelcde2)) {
								sb.append("<C_MODEL_CDE_2>");
								sb.append(cmodelcde2);
								sb.append("</C_MODEL_CDE_2>");
							}
						}
					
						if (vhlobj.containsKey("c_car_age")) {
							String ccarage = vhlobj.getString("c_car_age");
							if (StringUtils.isNotEmpty(ccarage)) {
								sb.append("<C_CAR_AGE>");
								sb.append(ccarage);
								sb.append("</C_CAR_AGE>");
							}
						}
						
						if (vhlobj.containsKey("c_last_year_clm_tms")) {
							String clastyearclmtms = vhlobj.getString("c_last_year_clm_tms");
							if (StringUtils.isNotEmpty(clastyearclmtms)) {
								sb.append("<C_LAST_YEAR_CLM_TMS>");
								sb.append(clastyearclmtms);
								sb.append("</C_LAST_YEAR_CLM_TMS>");
							}
						}
						if (vhlobj.containsKey("t_transfer_tm")) {
							String ttransfertm = vhlobj.getString("t_transfer_tm");
							if (StringUtils.isNotEmpty(ttransfertm)) {
								sb.append("<T_TRANSFER_TM>");
								sb.append(ttransfertm);
								sb.append("</T_TRANSFER_TM>");
							}
						}
						if (vhlobj.containsKey("c_change_flag")) {
							String cchangeflag = vhlobj.getString("c_change_flag");
							if (StringUtils.isNotEmpty(cchangeflag)) {
								sb.append("<C_CHANGE_FLAG>");
								sb.append(cchangeflag);
								sb.append("</C_CHANGE_FLAG>");
							}
						}
						 
						if (vhlobj.containsKey("c_careful_date")) {
							String ccarefuldate = vhlobj.getString("c_careful_date");
							if (StringUtils.isNotEmpty(ccarefuldate)) {
								sb.append("<C_CAREFUL_DATE>");
								sb.append(ccarefuldate);
								sb.append("</C_CAREFUL_DATE>");
							}
						}
						
						if (vhlobj.containsKey("c_inspect_rec")) {
							String cinspectrec = vhlobj.getString("c_inspect_rec");
							if (StringUtils.isNotEmpty(cinspectrec)) {
								sb.append("<C_INSPECT_REC>");
								sb.append(cinspectrec);
								sb.append("</C_INSPECT_REC>");
							}
						}
						if (vhlobj.containsKey("t_inspect_tm")) {
							String tinspecttm = vhlobj.getString("t_inspect_tm");
							if (StringUtils.isNotEmpty(tinspecttm)) {
								sb.append("<T_INSPECT_TM>");
								sb.append(tinspecttm);
								sb.append("</T_INSPECT_TM>");
							}
						}
						if (vhlobj.containsKey("c_car_by_city")) {
							String ccarbycity = vhlobj.getString("c_car_by_city");
							if (StringUtils.isNotEmpty(ccarbycity)) {
								sb.append("<C_CAR_BY_CITY>");
								sb.append(ccarbycity);
								sb.append("</C_CAR_BY_CITY>");
							}
						}
						if (vhlobj.containsKey("c_car_by_area")) {
							String ccarbyarea = vhlobj.getString("c_car_by_area");
							if (StringUtils.isNotEmpty(ccarbyarea)) {
								sb.append("<C_CAR_BY_AREA>");
								sb.append(ccarbyarea);
								sb.append("</C_CAR_BY_AREA>");
							}
						}
						
						if (vhlobj.containsKey("c_resv_txt_6")) {
							String cresvtxt6 = vhlobj.getString("c_resv_txt_6");
							if (StringUtils.isNotEmpty(cresvtxt6)) {
								sb.append("<C_RESV_TXT_6>");
								sb.append(cresvtxt6);
								sb.append("</C_RESV_TXT_6>");
							}
						}

						if (vhlobj.containsKey("c_vhl_pkg_no")) {
							String cvhlpkgno = vhlobj.getString("c_vhl_pkg_no");
							if (StringUtils.isNotEmpty(cvhlpkgno)) {
								sb.append("<C_VHL_PKG_NO>");
								sb.append(cvhlpkgno);
								sb.append("</C_VHL_PKG_NO>");
							}
						}
						if (vhlobj.containsKey("n_discuss_actual_value")) {
							String ndiscussactualvalue = vhlobj.getString("n_discuss_actual_value");
							if (StringUtils.isNotEmpty(ndiscussactualvalue)) {
								sb.append("<N_DISCUSS_ACTUAL_VALUE>");
								sb.append(ndiscussactualvalue);
								sb.append("</N_DISCUSS_ACTUAL_VALUE>");
							}
						}
						
						if (vhlobj.containsKey("c_model_id_code")) {
							String cmodelidcode = vhlobj.getString("c_model_id_code");
							if (StringUtils.isNotEmpty(cmodelidcode)) {
								sb.append("<C_MODEL_ID_CODE>");
								sb.append(cmodelidcode);
								sb.append("</C_MODEL_ID_CODE>");
							}
						}
						
						if (vhlobj.containsKey("c_family_code")) {
							String cfamilycode = vhlobj.getString("c_family_code");
							if (StringUtils.isNotEmpty(cfamilycode)) {
								sb.append("<C_FAMILY_CODE>");
								sb.append(cfamilycode);
								sb.append("</C_FAMILY_CODE>");
							}
						}
						
						if (vhlobj.containsKey("c_inspect_tm")) {
							String cinspecttm = vhlobj.getString("c_inspect_tm");
							if (StringUtils.isNotEmpty(cinspecttm)) {
								sb.append("<C_INSPECT_TM>");
								sb.append(cinspecttm);
								sb.append("</C_INSPECT_TM>");
							}
						}
						
						if (vhlobj.containsKey("c_pay_loan")) {
							String cpayloan = vhlobj.getString("c_pay_loan");
							if (StringUtils.isNotEmpty(cpayloan)) {
								sb.append("<C_PAY_LOAN>");
								sb.append(cpayloan);
								sb.append("</C_PAY_LOAN>");
							}
						}
						
						if (vhlobj.containsKey("c_plate_no")) {
							String cplateno = vhlobj.getString("c_plate_no");
							if (StringUtils.isNotEmpty(cplateno)) {
								sb.append("<C_PLATE_NO>");
								sb.append(cplateno);
								sb.append("</C_PLATE_NO>");
							}else{
								cplateno = "*-*";
								sb.append("<C_PLATE_NO>");
								sb.append(cplateno);
								sb.append("</C_PLATE_NO>");
							}
							
							resMap.put("c_plate_no", cplateno);
						}
						if (vhlobj.containsKey("c_natof_busines")) {
							String cnatofbusines = vhlobj.getString("c_natof_busines");
							if (StringUtils.isNotEmpty(cnatofbusines)) {
								sb.append("<C_NATOF_BUSINES>");
								sb.append(cnatofbusines);
								sb.append("</C_NATOF_BUSINES>");
							}
						}
						if (vhlobj.containsKey("c_plate_typ")) {
							String cplatetyp = vhlobj.getString("c_plate_typ");
							if (StringUtils.isNotEmpty(cplatetyp)) {
								sb.append("<C_PLATE_TYP>");
								sb.append(cplatetyp);
								sb.append("</C_PLATE_TYP>");
							}
						}
						if (vhlobj.containsKey("c_new_mrk")) {
							String cnewmrk = vhlobj.getString("c_new_mrk");
							if (StringUtils.isNotEmpty(cnewmrk)) {
								sb.append("<C_NEW_MRK>");
								sb.append(cnewmrk);
								sb.append("</C_NEW_MRK>");
							}
						}
						if (vhlobj.containsKey("c_new_vhl_flag")) {
							String cnewvhlflag = vhlobj.getString("c_new_vhl_flag");
							if (StringUtils.isNotEmpty(cnewvhlflag)) {
								sb.append("<C_NEW_VHL_FLAG>");
								sb.append(cnewvhlflag);
								sb.append("</C_NEW_VHL_FLAG>");
							}
						}
						if (vhlobj.containsKey("c_transfer_mrk")) {
							String ctransfermrk = vhlobj.getString("c_transfer_mrk");
							if (StringUtils.isNotEmpty(ctransfermrk)) {
								sb.append("<C_TRANSFER_MRK>");
								sb.append(ctransfermrk);
								sb.append("</C_TRANSFER_MRK>");
							}
						}
						if (vhlobj.containsKey("c_ecdemic_mrk")) {
							String cecdemicmrk = vhlobj.getString("c_ecdemic_mrk");
							if (StringUtils.isNotEmpty(cecdemicmrk)) {
								sb.append("<C_ECDEMIC_MRK>");
								sb.append(cecdemicmrk);
								sb.append("</C_ECDEMIC_MRK>");
							}
						}
						if (vhlobj.containsKey("t_fst_reg_ym")) {
							String tfstregym = vhlobj.getString("t_fst_reg_ym");
							resMap.put("t_fst_reg_ym", tfstregym);
							if (StringUtils.isNotEmpty(tfstregym)) {
								if("V7203".equals(transtype)|| "V7620".equals(transtype)){
									sb.append("<C_FST_REG_YM>");
								}else{
									sb.append("<T_FST_REG_YM>");
								}
								sb.append(tfstregym);
								if("V7203".equals(transtype) || "V7620".equals(transtype)){
									sb.append("</C_FST_REG_YM>");
								}else{
									sb.append("</T_FST_REG_YM>");
								}
								//处理 N_CAR_AGE
								int yrint = 0;
								boolean isValue = false;
								if(StringUtils.isNotEmpty(tinsrncbgntmbiz)){
									yrint = DateUtils1.calInterval(DateUtils1.fomatDate(tfstregym), DateUtils1.fomatDate(tinsrncbgntmbiz), "Y");
									isValue = true;
								}else{
									if(isTpf){
										if(StringUtils.isNotEmpty(tinsrncbgntmtpf)){
											yrint=  DateUtils1.calInterval(DateUtils1.fomatDate(tfstregym), DateUtils1.fomatDate(tinsrncbgntmtpf), "Y");
											isValue = true;
										}
									}
								}
								
								if(isValue){
									if(yrint < 1){
										sb.append("<N_CAR_AGE>");
										sb.append("306001");
										sb.append("</N_CAR_AGE>");
									}else if(2>yrint && yrint >=1){
										sb.append("<N_CAR_AGE>");
										sb.append("306002");
										sb.append("</N_CAR_AGE>");
									}else if(3>yrint&& yrint >=2){
										sb.append("<N_CAR_AGE>");
										sb.append("306003");
										sb.append("</N_CAR_AGE>");
									}else if(4>yrint&& yrint >=3){
										sb.append("<N_CAR_AGE>");
										sb.append("306004");
										sb.append("</N_CAR_AGE>");
									}else if(6>yrint&& yrint >=4){
										sb.append("<N_CAR_AGE>");
										sb.append("306005");
										sb.append("</N_CAR_AGE>");
									}else if(yrint >=6){
										sb.append("<N_CAR_AGE>");
										sb.append("306007");
										sb.append("</N_CAR_AGE>");
									}
								}
								
							}
						}
						if (vhlobj.containsKey("c_eng_no")) {
							String cengno = vhlobj.getString("c_eng_no");
							if (StringUtils.isNotEmpty(cengno)) {
								sb.append("<C_ENG_NO>");
								sb.append(cengno);
								sb.append("</C_ENG_NO>");
								resMap.put("c_eng_no", cengno);
							}
						}
						if (vhlobj.containsKey("c_frm_no")) {
							String cfrmno = vhlobj.getString("c_frm_no");
							if (StringUtils.isNotEmpty(cfrmno)) {
								sb.append("<C_FRM_NO>");
								sb.append(cfrmno);
								sb.append("</C_FRM_NO>");
								resMap.put("c_frm_no", cfrmno);
							}
						}
						if (vhlobj.containsKey("c_vin")) {
							String cvin = vhlobj.getString("c_vin");
							if (StringUtils.isNotEmpty(cvin)) {
								sb.append("<C_VIN>");
								sb.append(cvin);
								sb.append("</C_VIN>");
							}else{
								String ccvin = vhlobj.getString("c_frm_no");
								sb.append("<C_VIN>");
								sb.append(ccvin);
								sb.append("</C_VIN>");
							}
						}
						if (vhlobj.containsKey("c_plate_color")) {
							String cplatecolor = vhlobj.getString("c_plate_color");
							if (StringUtils.isNotEmpty(cplatecolor)) {
								sb.append("<C_PLATE_COLOR>");
								sb.append(cplatecolor);
								sb.append("</C_PLATE_COLOR>");
							}
						}
						if (vhlobj.containsKey("c_tfi_special_mrk")) {
							String ctfispecialmrk = vhlobj
									.getString("c_tfi_special_mrk");
							if (StringUtils.isNotEmpty(ctfispecialmrk)) {
								sb.append("<C_TFI_SPECIAL_MRK>");
								sb.append(ctfispecialmrk);
								sb.append("</C_TFI_SPECIAL_MRK>");
							}
						}
						if (vhlobj.containsKey("c_use_year")) {
							String cuseyear = vhlobj.getString("c_use_year");
							if (StringUtils.isNotEmpty(cuseyear)) {
								sb.append("<C_USE_YEAR>");
								sb.append(cuseyear);
								sb.append("</C_USE_YEAR>");
							}
						}
						if (vhlobj.containsKey("n_year_run_miles")) {
							String nyearrunmiles = vhlobj
									.getString("n_year_run_miles");
							if (StringUtils.isNotEmpty(nyearrunmiles)) {
								sb.append("<N_YEAR_RUN_MILES>");
								sb.append(nyearrunmiles);
								sb.append("</N_YEAR_RUN_MILES>");
							}
						}
						if (vhlobj.containsKey("c_travel_area_cde")) {
							String ctravelareacde = vhlobj
									.getString("c_travel_area_cde");
							if (StringUtils.isNotEmpty(ctravelareacde)) {
								sb.append("<C_TRAVEL_AREA_CDE>");
								sb.append(ctravelareacde);
								sb.append("</C_TRAVEL_AREA_CDE>");
							}
						}
						if (vhlobj.containsKey("c_vehicle_model")) {
							String cvehiclemodel = vhlobj.getString("c_vehicle_model");
							if (StringUtils.isNotEmpty(cvehiclemodel)) {
								sb.append("<C_VEHICLE_MODEL>");
								sb.append(cvehiclemodel);
								sb.append("</C_VEHICLE_MODEL>");
							}
						}
						if (vhlobj.containsKey("c_vehicle_brand")) {
							String cvehiclebrand = vhlobj.getString("c_vehicle_brand");
							if (StringUtils.isNotEmpty(cvehiclebrand)) {
								sb.append("<C_VEHICLE_BRAND>");
								sb.append(cvehiclebrand);
								sb.append("</C_VEHICLE_BRAND>");
							}
						}
						if (vhlobj.containsKey("c_nat_of_busines")) {
							String cnatofbusines = vhlobj
									.getString("c_nat_of_busines");
							if (StringUtils.isNotEmpty(cnatofbusines)) {
								sb.append("<C_NAT_OF_BUSINES>");
								sb.append(cnatofbusines);
								sb.append("</C_NAT_OF_BUSINES>");
							}
						}
						if (vhlobj.containsKey("c_refine_model")) {
							String crefinemodel = vhlobj.getString("c_refine_model");
							if (StringUtils.isNotEmpty(crefinemodel)) {
								sb.append("<C_REFINE_MODEL>");
								sb.append(crefinemodel);
								sb.append("</C_REFINE_MODEL>");
							}
						}
						if (vhlobj.containsKey("c_usage_cde")) {
							String cusagecde = vhlobj.getString("c_usage_cde");
							if (StringUtils.isNotEmpty(cusagecde)) {
								sb.append("<C_USAGE_CDE>");
								sb.append(cusagecde);
								sb.append("</C_USAGE_CDE>");
							}
						}
						if (vhlobj.containsKey("c_vhl_typ")) {
							String cvhltyp = vhlobj.getString("c_vhl_typ");
							if (StringUtils.isNotEmpty(cvhltyp)) {
								sb.append("<C_VHL_TYP>");
								sb.append(cvhltyp);
								sb.append("</C_VHL_TYP>");
							}
							resMap.put("c_vhl_typ", cvhltyp);
						}
						if (vhlobj.containsKey("c_mfg_year")) {
							String cmfgyear = vhlobj.getString("c_mfg_year");
							if (StringUtils.isNotEmpty(cmfgyear)) {
								sb.append("<C_MFG_YEAR>");
								sb.append(cmfgyear);
								sb.append("</C_MFG_YEAR>");
							}
						}
						if (vhlobj.containsKey("n_limit_load_person")) {
							String nlimitloadperson = vhlobj
									.getString("n_limit_load_person");
							if (StringUtils.isNotEmpty(nlimitloadperson)) {
								sb.append("<N_LIMIT_LOAD_PERSON>");
								sb.append(nlimitloadperson);
								sb.append("</N_LIMIT_LOAD_PERSON>");
							}
						}
						if (vhlobj.containsKey("n_tonage")) {
							String ntonage = vhlobj.getString("n_tonage");
							if (StringUtils.isNotEmpty(ntonage)) {
								sb.append("<N_TONAGE>");
								sb.append(ntonage);
								sb.append("</N_TONAGE>");
							}else{
								sb.append("<N_TONAGE>");
								sb.append("0");
								sb.append("</N_TONAGE>");
							}
						}else{
							sb.append("<N_TONAGE>");
							sb.append("0");
							sb.append("</N_TONAGE>");
						}
						if (vhlobj.containsKey("n_displacement")) {
							String ndisplacement = vhlobj.getString("n_displacement");
							if (StringUtils.isNotEmpty(ndisplacement)) {
								sb.append("<N_DISPLACEMENT>");
								sb.append(ndisplacement);
								sb.append("</N_DISPLACEMENT>");
							}
						}
						if (vhlobj.containsKey("n_po_weight")) {
							String npoweight = vhlobj.getString("n_po_weight");
							if (StringUtils.isNotEmpty(npoweight)) {
								sb.append("<N_PO_WEIGHT>");
								sb.append(npoweight);
								sb.append("</N_PO_WEIGHT>");
							}
						}
						if (vhlobj.containsKey("po_weight")) {
							String poweight = vhlobj.getString("po_weight");
							if (StringUtils.isNotEmpty(poweight)) {
								sb.append("<PO_WEIGHT>");
								sb.append(poweight);
								sb.append("</PO_WEIGHT>");
							}
						}
						if (vhlobj.containsKey("n_displacement_lvl")) {
							String ndisplacementlvl = vhlobj.getString("n_displacement_lvl");
							if (StringUtils.isNotEmpty(ndisplacementlvl)) {
								sb.append("<N_DISPLACEMENT_LVL>");
								sb.append(ndisplacementlvl);
								sb.append("</N_DISPLACEMENT_LVL>");
							}
						}
						if (vhlobj.containsKey("c_new_purchase_value")) {
							String cnewpurchasevalue = vhlobj
									.getString("c_new_purchase_value");
							if (StringUtils.isNotEmpty(cnewpurchasevalue)) {
								sb.append("<C_NEW_PURCHASE_VALUE>");
								sb.append(cnewpurchasevalue);
								sb.append("</C_NEW_PURCHASE_VALUE>");
							}
						}
						if (vhlobj.containsKey("c_fuel_type")) {
							String cfueltype = vhlobj.getString("c_fuel_type");
							if (StringUtils.isNotEmpty(cfueltype)) {
								sb.append("<C_FUEL_TYPE>");
								sb.append(cfueltype);
								sb.append("</C_FUEL_TYPE>");
							}
						}
						if (vhlobj.containsKey("c_model_cde")) {
							String cmodelcde = vhlobj.getString("c_model_cde");
							if (StringUtils.isNotEmpty(cmodelcde)) {
								sb.append("<C_MODEL_CDE>");
								sb.append(cmodelcde);
								sb.append("</C_MODEL_CDE>");
							}
						}
						if (vhlobj.containsKey("c_model_nme")) {
							String cmodelnme = vhlobj.getString("c_model_nme");
							if (StringUtils.isNotEmpty(cmodelnme)) {
								sb.append("<C_MODEL_NME>");
								sb.append(cmodelnme);
								sb.append("</C_MODEL_NME>");
							}
						}
						if (vhlobj.containsKey("c_prod_place")) {
							String cprodplace = vhlobj.getString("c_prod_place");
							if (StringUtils.isNotEmpty(cprodplace)) {
								sb.append("<C_PROD_PLACE>");
								sb.append(cprodplace);
								sb.append("</C_PROD_PLACE>");
							}
						}
						if (vhlobj.containsKey("c_body_color")) {
							String cbodycolor = vhlobj.getString("c_body_color");
							if (StringUtils.isNotEmpty(cbodycolor)) {
								sb.append("<C_BODY_COLOR>");
								sb.append(cbodycolor);
								sb.append("</C_BODY_COLOR>");
							}
						}
						if (vhlobj.containsKey("c_mon_desp_rate")) {
							String cmondesprate = vhlobj.getString("c_mon_desp_rate");
							if (StringUtils.isNotEmpty(cmondesprate)) {
								sb.append("<C_MON_DESP_RATE>");
								sb.append(cmondesprate);
								sb.append("</C_MON_DESP_RATE>");
							}
						}
						if (vhlobj.containsKey("c_reg_dri_typ")) {
							String cregdrityp = vhlobj.getString("c_reg_dri_typ");
							if (StringUtils.isNotEmpty(cregdrityp)) {
								sb.append("<C_REG_DRI_TYP>");
								sb.append(cregdrityp);
								sb.append("</C_REG_DRI_TYP>");
							}
						}
						if (vhlobj.containsKey("c_reg_vhl_typ")) {
							String cregvhltyp = vhlobj.getString("c_reg_vhl_typ");
							if (StringUtils.isNotEmpty(cregvhltyp)) {
								sb.append("<C_REG_VHL_TYP>");
								sb.append(cregvhltyp);
								sb.append("</C_REG_VHL_TYP>");
								
								//
								sb.append("<C_CARD_DETAIL>");
								sb.append(cregvhltyp);
								sb.append("</C_CARD_DETAIL>");
							}
						}
						if (vhlobj.containsKey("c_loan_vehicle_flag")) {
							String cloanvehicleflag = vhlobj
									.getString("c_loan_vehicle_flag");
							if (StringUtils.isNotEmpty(cloanvehicleflag)) {
								sb.append("<C_LOAN_VEHICLE_FLAG>");
								sb.append(cloanvehicleflag);
								sb.append("</C_LOAN_VEHICLE_FLAG>");
							}
						}
						if (vhlobj.containsKey("c_fleet_mrk")) {
							String cfleetmrk = vhlobj.getString("c_fleet_mrk");
							if (StringUtils.isNotEmpty(cfleetmrk)) {
								sb.append("<C_FLEET_MRK>");
								sb.append(cfleetmrk);
								sb.append("</C_FLEET_MRK>");
							}else{
								sb.append("<C_FLEET_MRK>");
								sb.append("0");
								sb.append("</C_FLEET_MRK>");
							}
						}
						
						if (vhlobj.containsKey("c_glass_typ")) {
							String cglasstyp = vhlobj.getString("c_glass_typ");
							if (StringUtils.isNotEmpty(cglasstyp)) {
								sb.append("<C_GLASS_TYP>");
								sb.append(cglasstyp);
								sb.append("</C_GLASS_TYP>");
							}
						}
						if (vhlobj.containsKey("t_transfer_date")) {
							String ttransferdate = vhlobj.getString("t_transfer_date");
							if (StringUtils.isNotEmpty(ttransferdate)) {
								sb.append("<T_TRANSFER_DATE>");
								sb.append(ttransferdate);
								sb.append("</T_TRANSFER_DATE>");
							}
						}
						if (vhlobj.containsKey("c_change")) {
							String cchange = vhlobj.getString("c_change");
							if (StringUtils.isNotEmpty(cchange)) {
								sb.append("<C_CHANGE>");
								sb.append(cchange);
								sb.append("</C_CHANGE>");
							}
						}
						if (vhlobj.containsKey("c_power_type")) {
							String cpowertype = vhlobj.getString("c_power_type");
							if (StringUtils.isNotEmpty(cpowertype)) {
								sb.append("<C_POWER_TYPE>");
								sb.append(cpowertype);
								sb.append("</C_POWER_TYPE>");
							}
						}
						if (vhlobj.containsKey("n_of_prov_num")) {
							String nofprovnum = vhlobj.getString("n_of_prov_num");
							if (StringUtils.isNotEmpty(nofprovnum)) {
								sb.append("<N_OF_PROV_NUM>");
								sb.append(nofprovnum);
								sb.append("</N_OF_PROV_NUM>");
							}
						}
						if (vhlobj.containsKey("n_actual_value")) {
							String nactualvalue = vhlobj.getString("n_actual_value");
							if (StringUtils.isNotEmpty(nactualvalue)) {
								sb.append("<N_ACTUAL_VALUE>");
								sb.append(nactualvalue);
								sb.append("</N_ACTUAL_VALUE>");
							}
						}
						if (vhlobj.containsKey("c_ref_code1")) {
							String crefcode1 = vhlobj.getString("c_ref_code1");
							if (StringUtils.isNotEmpty(crefcode1)) {
								sb.append("<C_REF_CODE1>");
								sb.append(crefcode1);
								sb.append("</C_REF_CODE1>");
							}
						}
						if (vhlobj.containsKey("c_ref_code2")) {
							String crefcode2 = vhlobj.getString("c_ref_code2");
							if (StringUtils.isNotEmpty(crefcode2)) {
								sb.append("<C_REF_CODE2>");
								sb.append(crefcode2);
								sb.append("</C_REF_CODE2>");
							}
						}
						if (vhlobj.containsKey("c_card_detail")) {
							String ccarddetail = vhlobj.getString("c_card_detail");
							if (StringUtils.isNotEmpty(ccarddetail)) {
								sb.append("<C_CARD_DETAIL>");
								sb.append(ccarddetail);
								sb.append("</C_CARD_DETAIL>");
							}
						}
						if (vhlobj.containsKey("c_model_code")) {
							String nactualvalue = vhlobj.getString("c_model_code");
							if (StringUtils.isNotEmpty(nactualvalue)) {
								sb.append("<C_MODEL_CODE>");
								sb.append(nactualvalue);
								sb.append("</C_MODEL_CODE>");
							}
						}
						if (vhlobj.containsKey("c_car_name")) {
							String ccarname = vhlobj.getString("c_car_name");
							if (StringUtils.isNotEmpty(ccarname)) {
								sb.append("<C_CAR_NAME>");
								sb.append(ccarname);
								sb.append("</C_CAR_NAME>");
							}
						}
						if (vhlobj.containsKey("t_poli_find_date")) {
							String tpolifinddate = vhlobj.getString("t_poli_find_date");
							if (StringUtils.isNotEmpty(tpolifinddate)) {
								sb.append("<T_POLI_FIND_DATE>");
								sb.append(tpolifinddate);
								sb.append("</T_POLI_FIND_DATE>");
							}
						}
						if (vhlobj.containsKey("t_start_date")) {
							String tstartdate = vhlobj.getString("t_start_date");
							if (StringUtils.isNotEmpty(tstartdate)) {
								sb.append("<T_START_DATE>");
								sb.append(tstartdate);
								sb.append("</T_START_DATE>");
							}
						}
						if (vhlobj.containsKey("c_search_code")) {
							String csearchcode = vhlobj.getString("c_search_code");
							if (StringUtils.isNotEmpty(csearchcode)) {
								sb.append("<C_SEARCH_CODE>");
								sb.append(csearchcode);
								sb.append("</C_SEARCH_CODE>");
							}
						}
						if (vhlobj.containsKey("n_discus_useval")) {
							String ndiscususeval = vhlobj.getString("n_discus_useval");
							if (StringUtils.isNotEmpty(ndiscususeval)) {
								sb.append("<N_DISCUS_USEVAL>");
								sb.append(ndiscususeval);
								sb.append("</N_DISCUS_USEVAL>");
							}
						}
						if (vhlobj.containsKey("exhaust_capacity")) {
							String exhaustcapacity = vhlobj.getString("exhaust_capacity");
							if (StringUtils.isNotEmpty(exhaustcapacity)) {
								sb.append("<EXHAUST_CAPACITY>");
								sb.append(exhaustcapacity);
								sb.append("</EXHAUST_CAPACITY>");
							}
						}
						if("B105".equals(transtype)){
//							1-	简易型；仅查询车型信息（此模式中仅传车架号和发动机号）
//							2- 标准型；查询车型及纯风险保费信息
							String queryModel = StringUtils.EMPTY;
							if (vhlobj.containsKey("QueryModel")) {
								queryModel = vhlobj.getString("QueryModel");
							}
							if (StringUtils.isEmpty(queryModel)) {
								queryModel = "2";
							}
							sb.append("<QueryModel>");
							sb.append(queryModel);
							sb.append("</QueryModel>");
						}
						
						if("V7203".equals(transtype) || "V7620".equals(transtype)){
							sb.append("</VEHICLE>");
						}else{
							sb.append("</VHL_INFO>");
						}
					}
				}
	//******************************************************************************************************************			
				if (bodyobj.containsKey("vhlowner")) {
					JSONObject ownobj = bodyobj.getJSONObject("vhlowner");
					if (!ownobj.isNullObject() && "Y".equals(isvhlowner)) {
						sb.append("<VHLOWNER>");
						if (ownobj.containsKey("c_owner_nme")) {
							String cownernme = ownobj.getString("c_owner_nme");
							if (StringUtils.isNotEmpty(cownernme)) {
								sb.append("<C_OWNER_NME>");
								sb.append(cownernme);
								sb.append("</C_OWNER_NME>");
								resMap.put("c_owner_nme", cownernme);
							}
						}
						if (ownobj.containsKey("c_certf_cls")) {
							String ccertfcls = ownobj.getString("c_certf_cls");
							if (StringUtils.isNotEmpty(ccertfcls)) {
								sb.append("<C_CERTF_CLS>");
								sb.append(ccertfcls);
								sb.append("</C_CERTF_CLS>");
							}
						}
						if (ownobj.containsKey("c_certf_cde")) {
							String ccertfcde = ownobj.getString("c_certf_cde");
							if (StringUtils.isNotEmpty(ccertfcde)) {
								sb.append("<C_CERTF_CDE>");
								sb.append(ccertfcde);
								sb.append("</C_CERTF_CDE>");
							}
						}
						if (ownobj.containsKey("c_cowner_typ")) {
							String ccownertyp = ownobj.getString("c_cowner_typ");
							if (StringUtils.isNotEmpty(ccownertyp)) {
								sb.append("<C_COWNER_TYP>");
								sb.append(ccownertyp);
								sb.append("</C_COWNER_TYP>");
							}
						}
						if (ownobj.containsKey("c_owner_cls")) {
							String cownercls = ownobj.getString("c_owner_cls");
							if (StringUtils.isNotEmpty(cownercls)) {
								sb.append("<C_OWNER_CLS>");
								sb.append(cownercls);
								sb.append("</C_OWNER_CLS>");
							}
						}
						if (ownobj.containsKey("c_cowner_age")) {
							String ccownerage = ownobj.getString("c_cowner_age");
							if (StringUtils.isNotEmpty(ccownerage)) {
								sb.append("<C_COWNER_AGE>");
								sb.append(ccownerage);
								sb.append("</C_COWNER_AGE>");
							}
						}
						if (ownobj.containsKey("c_owner_age")) {
							String cownerage = ownobj.getString("c_owner_age");
							if (StringUtils.isNotEmpty(cownerage)) {
								sb.append("<C_OWNER_AGE>");
								sb.append(cownerage);
								sb.append("</C_OWNER_AGE>");
							}
						}
						if (ownobj.containsKey("c_gender")) {
							String cgender = ownobj.getString("c_gender");
							if (StringUtils.isNotEmpty(cgender)) {
								sb.append("<C_GENDER>");
								sb.append(cgender);
								sb.append("</C_GENDER>");
							}
						}
						if (ownobj.containsKey("c_owner_sex")) {
							String cownersex = ownobj.getString("c_owner_sex");
							if (StringUtils.isNotEmpty(cownersex)) {
								sb.append("<C_OWNER_SEX>");
								sb.append(cownersex);
								sb.append("</C_OWNER_SEX>");
							}
						}
						if (ownobj.containsKey("c_age_lvl")) {
							String cagelvl = ownobj.getString("c_age_lvl");
							if (StringUtils.isNotEmpty(cagelvl)) {
								sb.append("<C_AGE_LVL>");
								sb.append(cagelvl);
								sb.append("</C_AGE_LVL>");
							}
						}
						if (ownobj.containsKey("c_clnt_mrk")) {
							String cclntmrk = ownobj.getString("c_clnt_mrk");
							if (StringUtils.isNotEmpty(cclntmrk)) {
								sb.append("<C_CLNT_MRK>");
								sb.append(cclntmrk);
								sb.append("</C_CLNT_MRK>");
							}
						}
						sb.append("</VHLOWNER>");
					}
				}
		//**************************************************************************		
				if (bodyobj.containsKey("policyholder")) {
					JSONObject policyobj = bodyobj.getJSONObject("policyholder");
					if (!policyobj.isNullObject() && "Y".equals(ispolicyholder)) {
						if("V7203".equals(transtype)  || "V7620".equals(transtype)){
							sb.append("<APPLICANT>");
						}else{
							sb.append("<POLICYHOLDER>");
						}
						
						if (policyobj.containsKey("c_insured_nme")) {
							String cinsurednme = policyobj.getString("c_insured_nme");
							if (StringUtils.isNotEmpty(cinsurednme)) {
								sb.append("<C_INSURED_NME>");
								sb.append(cinsurednme);
								sb.append("</C_INSURED_NME>");
								resMap.put("c_app_name", cinsurednme);//投保人名称
							}
						}
						if (policyobj.containsKey("c_clnt_mrk")) {
							String cclntmrk = policyobj.getString("c_clnt_mrk");
							if (StringUtils.isNotEmpty(cclntmrk)) {
								sb.append("<C_CLNT_MRK>");
								sb.append(cclntmrk);
								sb.append("</C_CLNT_MRK>");
							}
						}
						


						
						if (policyobj.containsKey("c_app_cde")) {
							String cappcde = policyobj.getString("c_app_cde");
							if (StringUtils.isNotEmpty(cappcde)) {
								sb.append("<C_APP_CDE>");
								sb.append(cappcde);
								sb.append("</C_APP_CDE>");
							}
						}
						if (policyobj.containsKey("c_app_nme")) {
							String cappnme = policyobj.getString("c_app_nme");
							if (StringUtils.isNotEmpty(cappnme)) {
								sb.append("<C_APP_NME>");
								sb.append(cappnme);
								sb.append("</C_APP_NME>");
							}
						}
						
						if (policyobj.containsKey("c_applicant_typ")) {
							String capplicanttyp = policyobj.getString("c_applicant_typ");
							if (StringUtils.isNotEmpty(capplicanttyp)) {
								sb.append("<C_APPLICANT_TYP>");
								sb.append(capplicanttyp);
								sb.append("</C_APPLICANT_TYP>");
							}
						}
						if (policyobj.containsKey("c_certf_cls")) {
							String ccertfcls = policyobj.getString("c_certf_cls");
							if (StringUtils.isNotEmpty(ccertfcls)) {
								sb.append("<C_CERTF_CLS>");
								sb.append(ccertfcls);
								sb.append("</C_CERTF_CLS>");
							}
						}
						if (policyobj.containsKey("c_certf_cde")) {
							String ccertfcde = policyobj.getString("c_certf_cde");
							if (StringUtils.isNotEmpty(ccertfcde)) {
								sb.append("<C_CERTF_CDE>");
								sb.append(ccertfcde);
								sb.append("</C_CERTF_CDE>");
							}
						}
						if (policyobj.containsKey("c_clnt_addr")) {
							String cclntaddr = policyobj.getString("c_clnt_addr");
							if (StringUtils.isNotEmpty(cclntaddr)) {
								sb.append("<C_CLNT_ADDR>");
								sb.append(cclntaddr);
								sb.append("</C_CLNT_ADDR>");
							}
						}
						if (policyobj.containsKey("c_country")) {
							String ccountry = policyobj.getString("c_country");
							if (StringUtils.isNotEmpty(ccountry)) {
								sb.append("<C_COUNTRY>");
								sb.append(ccountry);
								sb.append("</C_COUNTRY>");
							}
						}
						if (policyobj.containsKey("c_cus_type")) {
							String ccustype = policyobj.getString("c_cus_type");
							if (StringUtils.isNotEmpty(ccustype)) {
								sb.append("<C_CUS_TYPE>");
								sb.append(ccustype);
								sb.append("</C_CUS_TYPE>");
							}
						}
						if (policyobj.containsKey("c_mobile")) {
							String cmobile = policyobj.getString("c_mobile");
							if (StringUtils.isNotEmpty(cmobile)) {
								sb.append("<C_MOBILE>");
								sb.append(cmobile);
								sb.append("</C_MOBILE>");
							}
						}
						if (policyobj.containsKey("c_grp_flag")) {
							String cgrpflag = policyobj.getString("c_grp_flag");
							if (StringUtils.isNotEmpty(cgrpflag)) {
								sb.append("<C_GRP_FLAG>");
								sb.append(cgrpflag);
								sb.append("</C_GRP_FLAG>");
							}
						}
						if (policyobj.containsKey("c_cust_risk_rank")) {
							String ccustriskrank = policyobj.getString("c_cust_risk_rank");
							if (StringUtils.isNotEmpty(ccustriskrank)) {
								sb.append("<C_CUST_RISK_RANK>");
								sb.append(ccustriskrank);
								sb.append("</C_CUST_RISK_RANK>");
							}
						}
						if (policyobj.containsKey("c_ply_typ")) {
							String cplytyp = policyobj.getString("c_ply_typ");
							if (StringUtils.isNotEmpty(cplytyp)) {
								sb.append("<C_PLY_TYP>");
								sb.append(cplytyp);
								sb.append("</C_PLY_TYP>");
							}
						}
						if (policyobj.containsKey("c_tel")) {
							String ctel = policyobj.getString("c_tel");
							if (StringUtils.isNotEmpty(ctel)) {
								sb.append("<C_TEL>");
								sb.append(ctel);
								sb.append("</C_TEL>");
							}
						}
						if (policyobj.containsKey("c_email_code")) {
							String cemailcode = policyobj.getString("c_email_code");
							if (StringUtils.isNotEmpty(cemailcode)) {
								sb.append("<C_EMAIL_CODE>");
								sb.append(cemailcode);
								sb.append("</C_EMAIL_CODE>");
							}
						}
						if (policyobj.containsKey("c_transactor_name")) {
							String ctransactorname = policyobj.getString("c_transactor_name");
							if (StringUtils.isNotEmpty(ctransactorname)) {
								sb.append("<C_TRANSACTOR_NAME>");
								sb.append(ctransactorname);
								sb.append("</C_TRANSACTOR_NAME>");
							}
						}
						if (policyobj.containsKey("c_transactor_mobile")) {
							String ctransactormobile = policyobj.getString("c_transactor_mobile");
							if (StringUtils.isNotEmpty(ctransactormobile)) {
								sb.append("<C_TRANSACTOR_MOBILE>");
								sb.append(ctransactormobile);
								sb.append("</C_TRANSACTOR_MOBILE>");
							}
						}
						if (policyobj.containsKey("c_transactor_email")) {
							String ctransactoremail = policyobj.getString("c_transactor_email");
							if (StringUtils.isNotEmpty(ctransactoremail)) {
								sb.append("<C_TRANSACTOR_EMAIL>");
								sb.append(ctransactoremail);
								sb.append("</C_TRANSACTOR_EMAIL>");
							}
						}
						if (policyobj.containsKey("c_occup_cde")) {
							String coccupcde = policyobj.getString("c_occup_cde");
							if (StringUtils.isNotEmpty(coccupcde)) {
								sb.append("<C_OCCUP_CDE>");
								sb.append(coccupcde);
								sb.append("</C_OCCUP_CDE>");
							}
						}
						if (policyobj.containsKey("c_legal_nme")) {
							String clegalnme = policyobj.getString("c_legal_nme");
							if (StringUtils.isNotEmpty(clegalnme)) {
								sb.append("<C_LEGAL_NME>");
								sb.append(clegalnme);
								sb.append("</C_LEGAL_NME>");
							}
						}
						if (policyobj.containsKey("c_transactor_no")) {
							String ctransactorno = policyobj.getString("c_transactor_no");
							if (StringUtils.isNotEmpty(ctransactorno)) {
								sb.append("<C_TRANSACTOR_NO>");
								sb.append(ctransactorno);
								sb.append("</C_TRANSACTOR_NO>");
							}
						}
						if (policyobj.containsKey("c_transactor_no_typ")) {
							String ctransactornotyp = policyobj.getString("c_transactor_no_typ");
							if (StringUtils.isNotEmpty(ctransactornotyp)) {
								sb.append("<C_TRANSACTOR_NO_TYP>");
								sb.append(ctransactornotyp);
								sb.append("</C_TRANSACTOR_NO_TYP>");
							}
						}
						if (policyobj.containsKey("c_rel_cde")) {
							String crelcde = policyobj.getString("c_rel_cde");
							if (StringUtils.isNotEmpty(crelcde)) {
								sb.append("<C_REL_CDE>");
								sb.append(crelcde);
								sb.append("</C_REL_CDE>");
							}
						}
						if (policyobj.containsKey("c_rel_ben")) {
							String crelben = policyobj.getString("c_rel_ben");
							if (StringUtils.isNotEmpty(crelben)) {
								sb.append("<C_REL_BEN>");
								sb.append(crelben);
								sb.append("</C_REL_BEN>");
							}
						}
						if (policyobj.containsKey("c_suffix_addr")) {
							String csuffixaddr = policyobj.getString("c_suffix_addr");
							if (StringUtils.isNotEmpty(csuffixaddr)) {
								sb.append("<C_SUFFIX_ADDR>");
								sb.append(csuffixaddr);
								sb.append("</C_SUFFIX_ADDR>");
							}
						}
						if (policyobj.containsKey("c_zip_cde")) {
							String czipcde = policyobj.getString("c_zip_cde");
							if (StringUtils.isNotEmpty(czipcde)) {
								sb.append("<C_ZIP_CDE>");
								sb.append(czipcde);
								sb.append("</C_ZIP_CDE>");
							}
						}
						if (policyobj.containsKey("c_country_nam")) {
							String ccountrynam = policyobj.getString("c_country_nam");
							if (StringUtils.isNotEmpty(ccountrynam)) {
								sb.append("<C_COUNTRY_NAM>");
								sb.append(ccountrynam);
								sb.append("</C_COUNTRY_NAM>");
							}
						}
						if("V7203".equals(transtype) || "V7620".equals(transtype) ){
							sb.append("</APPLICANT>");
						}else{
							sb.append("</POLICYHOLDER>");
						}
					}
				}
				//start ...............................INSURED........................
				if (bodyobj.containsKey("insured")) {
					JSONObject insobj = bodyobj.getJSONObject("insured");
					if (!insobj.isNullObject() && "Y".equals(isinsured)) {
						sb.append("<INSURED>");
						if (insobj.containsKey("c_insured_nme")) {
							String cinsurednme = insobj.getString("c_insured_nme");
							if (StringUtils.isNotEmpty(cinsurednme)) {
								sb.append("<C_INSURED_NME>");
								sb.append(cinsurednme);
								sb.append("</C_INSURED_NME>");
								resMap.put("c_insured_name", cinsurednme);
							}
						}
						if (insobj.containsKey("c_certf_cls")) {
							String ccertfcls = insobj.getString("c_certf_cls");
							if (StringUtils.isNotEmpty(ccertfcls)) {
								sb.append("<C_CERTF_CLS>");
								sb.append(ccertfcls);
								sb.append("</C_CERTF_CLS>");
							}
						}
						if (insobj.containsKey("c_country_nam")) {
							String ccountrynam = insobj.getString("c_country_nam");
							if (StringUtils.isNotEmpty(ccountrynam)) {
								sb.append("<C_COUNTRY_NAM>");
								sb.append(ccountrynam);
								sb.append("</C_COUNTRY_NAM>");
							}
						}
						if (insobj.containsKey("c_country")) {
							String ccountry = insobj.getString("c_country");
							if (StringUtils.isNotEmpty(ccountry)) {
								sb.append("<C_COUNTRY>");
								sb.append(ccountry);
								sb.append("</C_COUNTRY>");
							}
						}
						if (insobj.containsKey("c_zip_cde")) {
							String czipcde = insobj.getString("c_zip_cde");
							if (StringUtils.isNotEmpty(czipcde)) {
								sb.append("<C_ZIP_CDE>");
								sb.append(czipcde);
								sb.append("</C_ZIP_CDE>");
							}
						}
						
						if (insobj.containsKey("c_insured_typ")) {
							String cinsuredtyp = insobj.getString("c_insured_typ");
							if (StringUtils.isNotEmpty(cinsuredtyp)) {
								sb.append("<C_INSURED_TYP>");
								sb.append(cinsuredtyp);
								sb.append("</C_INSURED_TYP>");
							}
						}
						if (insobj.containsKey("c_seq_no")) {
							String cseqno = insobj.getString("c_seq_no");
							if (StringUtils.isNotEmpty(cseqno)) {
								sb.append("<C_SEQ_NO>");
								sb.append(cseqno);
								sb.append("</C_SEQ_NO>");
							}
						}
						if (insobj.containsKey("c_mobile")) {
							String cmobile = insobj.getString("c_mobile");
							if (StringUtils.isNotEmpty(cmobile)) {
								sb.append("<C_MOBILE>");
								sb.append(cmobile);
								sb.append("</C_MOBILE>");
							}
						}
						if (insobj.containsKey("c_clnt_addr")) {
							String cclntaddr = insobj.getString("c_clnt_addr");
							if (StringUtils.isNotEmpty(cclntaddr)) {
								sb.append("<C_CLNT_ADDR>");
								sb.append(cclntaddr);
								sb.append("</C_CLNT_ADDR>");
							}
						}
						if (insobj.containsKey("c_clnt_mrk")) {
							String cclntmrk = insobj.getString("c_clnt_mrk");
							if (StringUtils.isNotEmpty(cclntmrk)) {
								sb.append("<C_CLNT_MRK>");
								sb.append(cclntmrk);
								sb.append("</C_CLNT_MRK>");
							}
						}
						if (insobj.containsKey("c_cert_no")) {
							String ccertno = insobj.getString("c_cert_no");
							if (StringUtils.isNotEmpty(ccertno)) {
								if("V7203".equals(transtype)){
									sb.append("<C_CERTF_CDE>");
								}else{
									sb.append("<C_CERT_NO>");
								}
								sb.append(ccertno);
								if("V7203".equals(transtype)){
									sb.append("</C_CERTF_CDE>");
								}else{
									sb.append("</C_CERT_NO>");
								}
							}
						}
						if (insobj.containsKey("c_insured_tel")) {
							String cinsuredtel = insobj.getString("c_insured_tel");
							if (StringUtils.isNotEmpty(cinsuredtel)) {
								sb.append("<C_INSURED_TEL>");
								sb.append(cinsuredtel);
								sb.append("</C_INSURED_TEL>");
							}
						}
						sb.append("</INSURED>");
					}
				}
				//end
				//........................................................
				if(isTpf){
					//JSONObject bodyobj,String cvrglistflag,String transtype ,StringBuffer sb
					fittingCvrgList(bodyobj,"cvrg_list_tpf",transtype,sb,isTpf);
				}else{
					fittingCvrgList(bodyobj,"cvrg_list_biz",transtype,sb,isTpf);
				}
				
				//end......................................................................................................
				if (isTpf && bodyobj.containsKey("tax_info")) {
					JSONObject taxobj = bodyobj.getJSONObject("tax_info");
					if (!taxobj.isNullObject() ) {
						if("V7203".equals(transtype)){
							sb.append("<TAXATION>");
						}else{
							sb.append("<TAX_INFO>");
						}
						
						if (taxobj.containsKey("c_paytax_typ")) {
							String cpaytaxtyp = taxobj.getString("c_paytax_typ");
							if (StringUtils.isNotEmpty(cpaytaxtyp)) {
								sb.append("<C_PAYTAX_TYP>");
								sb.append(cpaytaxtyp);
								sb.append("</C_PAYTAX_TYP>");
							}else{
								sb.append("<C_PAYTAX_TYP>");
								sb.append("T");
								sb.append("</C_PAYTAX_TYP>");
							}
						}
						if (taxobj.containsKey("c_tax_sign")) {
							String ctaxsign = taxobj.getString("c_tax_sign");
							if (StringUtils.isNotEmpty(ctaxsign)) {
								sb.append("<C_TAX_SIGN>");
								sb.append(ctaxsign);
								sb.append("</C_TAX_SIGN>");
							}
						}
						if (taxobj.containsKey("c_tax_item_cde")) {
							String ctaxitemcde = taxobj.getString("c_tax_item_cde");
							if (StringUtils.isNotEmpty(ctaxitemcde)) {
								sb.append("<C_TAX_ITEM_CDE>");
								sb.append(ctaxitemcde);
								sb.append("</C_TAX_ITEM_CDE>");
							}
						}
						if (taxobj.containsKey("c_taxpayer_nme")) {
							String ctaxpayerme = taxobj.getString("c_taxpayer_nme");
							if (StringUtils.isNotEmpty(ctaxpayerme)) {
								sb.append("<C_TAXPAYER_NME>");
								sb.append(ctaxpayerme);
								sb.append("</C_TAXPAYER_NME>");
							}
						}
						if (taxobj.containsKey("c_taxpayer_cert_no")) {
							String ctaxpayercert_no = taxobj.getString("c_taxpayer_cert_no");
							if (StringUtils.isNotEmpty(ctaxpayercert_no)) {
								sb.append("<C_TAXPAYER_CERT_NO>");
								sb.append(ctaxpayercert_no);
								sb.append("</C_TAXPAYER_CERT_NO>");
							}
						}
						if (taxobj.containsKey("c_taxpayer_id")) {
							String ctaxpayerid = taxobj.getString("c_taxpayer_id");
							if (StringUtils.isNotEmpty(ctaxpayerid)) {
								sb.append("<C_TAXPAYER_ID>");
								sb.append(ctaxpayerid);
								sb.append("</C_TAXPAYER_ID>");
							}
						}
						if (taxobj.containsKey("c_abate_mrk")) {
							String cabatemrk = taxobj.getString("c_abate_mrk");
							if (StringUtils.isNotEmpty(cabatemrk)) {
								sb.append("<C_ABATE_MRK>");
								sb.append(cabatemrk);
								sb.append("</C_ABATE_MRK>");
							}
						}
						if (taxobj.containsKey("c_abate_rsn")) {
							String cabatersn = taxobj.getString("c_abate_rsn");
							if (StringUtils.isNotEmpty(cabatersn)) {
								sb.append("<C_ABATE_RSN>");
								sb.append(cabatersn);
								sb.append("</C_ABATE_RSN>");
							}
						}
						if (taxobj.containsKey("c_free_type")) {
							String cfreetype = taxobj.getString("c_free_type");
							if (StringUtils.isNotEmpty(cfreetype)) {
								sb.append("<C_FREE_TYPE>");
								sb.append(cfreetype);
								sb.append("</C_FREE_TYPE>");
							}
						}
						if (taxobj.containsKey("c_tax_relief_cert_no")) {
							String ctaxreliefcertno = taxobj.getString("c_tax_relief_cert_no");
							if (StringUtils.isNotEmpty(ctaxreliefcertno)) {
								sb.append("<C_TAX_RELIEF_CERT_NO>");
								sb.append(ctaxreliefcertno);
								sb.append("</C_TAX_RELIEF_CERT_NO>");
							}
						}
						if (taxobj.containsKey("c_tax_payment_recpt_no")) {
							String ctaxpaymentrecptno = taxobj.getString("c_tax_payment_recpt_no");
							if (StringUtils.isNotEmpty(ctaxpaymentrecptno)) {
								sb.append("<C_TAX_PAYMENT_RECPT_NO>");
								sb.append(ctaxpaymentrecptno);
								sb.append("</C_TAX_PAYMENT_RECPT_NO>");
							}
						}
						if (taxobj.containsKey("n_curb_wt")) {
							String ncurbwt = taxobj.getString("n_curb_wt");
							if (StringUtils.isNotEmpty(ncurbwt)) {
								sb.append("<N_CURB_WT>");
								sb.append(ncurbwt);
								sb.append("</N_CURB_WT>");
							}
						}
						if (taxobj.containsKey("c_last_tax_year")) {
							String clasttaxyear = taxobj.getString("c_last_tax_year");
							if (StringUtils.isNotEmpty(clasttaxyear)) {
								sb.append("<C_LAST_TAX_YEAR>");
								sb.append(clasttaxyear);
								sb.append("</C_LAST_TAX_YEAR>");
							}
						}
						if (taxobj.containsKey("c_last_sali_end_date")) {
							String clastsalienddate = taxobj.getString("c_last_sali_end_date");
							if (StringUtils.isNotEmpty(clastsalienddate)) {
								sb.append("<C_LAST_SALI_END_DATE>");
								sb.append(clastsalienddate);
								sb.append("</C_LAST_SALI_END_DATE>");
							}
						}
						if (taxobj.containsKey("t_decleare_date")) {
							String tdeclearedate = taxobj.getString("t_decleare_date");
							if (StringUtils.isNotEmpty(tdeclearedate)) {
								sb.append("<T_DECLEARE_DATE>");
								sb.append(tdeclearedate);
								sb.append("</T_DECLEARE_DATE>");
							}
						}
						if (taxobj.containsKey("c_vs_tax_mrk")) {
							String cvstaxmrk = taxobj.getString("c_vs_tax_mrk");
							if (StringUtils.isNotEmpty(cvstaxmrk)) {
								sb.append("<C_VS_TAX_MRK>");
								sb.append(cvstaxmrk);
								sb.append("</C_VS_TAX_MRK>");
							}
						}
						if (taxobj.containsKey("t_certificate_date")) {
							String tcertificatedate = taxobj.getString("t_certificate_date");
							if (StringUtils.isNotEmpty(tcertificatedate)) {
								sb.append("<T_CERTIFICATE_DATE>");
								sb.append(tcertificatedate);
								sb.append("</T_CERTIFICATE_DATE>");
							}
						}
						if (taxobj.containsKey("n_charge_amt")) {
							String nchargeamt = taxobj.getString("n_charge_amt");
							if (StringUtils.isNotEmpty(nchargeamt)) {
								sb.append("<N_CHARGE_AMT>");
								sb.append(nchargeamt);
								sb.append("</N_CHARGE_AMT>");
							}
						}
						if (taxobj.containsKey("n_charge_prop")) {
							String nchargeprop = taxobj.getString("n_charge_prop");
							if (StringUtils.isNotEmpty(nchargeprop)) {
								sb.append("<N_CHARGE_PROP>");
								sb.append(nchargeprop);
								sb.append("</N_CHARGE_PROP>");
							}
						}
						if (taxobj.containsKey("n_taxable_months")) {
							String ntaxablemonths = taxobj.getString("n_taxable_months");
							if (StringUtils.isNotEmpty(ntaxablemonths)) {
								sb.append("<N_TAXABLE_MONTHS>");
								sb.append(ntaxablemonths);
								sb.append("</N_TAXABLE_MONTHS>");
							}
						}
						if (taxobj.containsKey("c_taxpayer_addr")) {
							String ctaxpayeraddr = taxobj.getString("c_taxpayer_addr");
							if (StringUtils.isNotEmpty(ctaxpayeraddr)) {
								sb.append("<C_TAXPAYER_ADDR>");
								sb.append(ctaxpayeraddr);
								sb.append("</C_TAXPAYER_ADDR>");
							}
						}
						if (taxobj.containsKey("c_taxpayer_cert_typ")) {
							String ctaxpayercerttyp = taxobj.getString("c_taxpayer_cert_typ");
							if (StringUtils.isNotEmpty(ctaxpayercerttyp)) {
								sb.append("<C_TAXPAYER_CERT_TYP>");
								sb.append(ctaxpayercerttyp);
								sb.append("</C_TAXPAYER_CERT_TYP>");
							}
						}
						if (taxobj.containsKey("t_bill_date")) {
							String tbilldate = taxobj.getString("t_bill_date");
							if (StringUtils.isNotEmpty(tbilldate)) {
								sb.append("<T_BILL_DATE>");
								sb.append(tbilldate);
								sb.append("</T_BILL_DATE>");
							}
						}
						if (taxobj.containsKey("n_exhaust_capacity")) {
							String nexhaustcapacity = taxobj.getString("n_exhaust_capacity");
							if (StringUtils.isNotEmpty(nexhaustcapacity)) {
								sb.append("<N_EXHAUST_CAPACITY>");
								sb.append(nexhaustcapacity);
								sb.append("</N_EXHAUST_CAPACITY>");
							}
						}
						if (taxobj.containsKey("n_last_year_taxable_months")) {
							String nlastyeartaxablemonths = taxobj.getString("n_last_year_taxable_months");
							if (StringUtils.isNotEmpty(nlastyeartaxablemonths)) {
								sb.append("<N_LAST_YEAR_TAXABLE_MONTHS>");
								sb.append(nlastyeartaxablemonths);
								sb.append("</N_LAST_YEAR_TAXABLE_MONTHS>");
							}
						}
						if (taxobj.containsKey("t_tax_eff_bgn_tm")) {
							String ttaxeffbgntm = taxobj.getString("t_tax_eff_bgn_tm");
							if (StringUtils.isNotEmpty(ttaxeffbgntm)) {
								sb.append("<T_TAX_EFF_BGN_TM>");
								sb.append(ttaxeffbgntm);
								sb.append("</T_TAX_EFF_BGN_TM>");
							}
						}
						if (taxobj.containsKey("t_tax_eff_end_tm")) {
							String ttaxeffendtm = taxobj.getString("t_tax_eff_end_tm");
							if (StringUtils.isNotEmpty(ttaxeffendtm)) {
								sb.append("<T_TAX_EFF_END_TM>");
								sb.append(ttaxeffendtm);
								sb.append("</T_TAX_EFF_END_TM>");
							}
						}
						if (taxobj.containsKey("n_abate_amt")) {
							String nabateamt = taxobj.getString("n_abate_amt");
							if (StringUtils.isNotEmpty(nabateamt)) {
								sb.append("<N_ABATE_AMT>");
								sb.append(nabateamt);
								sb.append("</N_ABATE_AMT>");
							}
						}
						if (taxobj.containsKey("n_abate_prop")) {
							String nabateprop = taxobj.getString("n_abate_prop");
							if (StringUtils.isNotEmpty(nabateprop)) {
								sb.append("<N_ABATE_PROP>");
								sb.append(nabateprop);
								sb.append("</N_ABATE_PROP>");
							}
						}
						if (taxobj.containsKey("n_overdue_days")) {
							String noverduedays = taxobj.getString("n_overdue_days");
							if (StringUtils.isNotEmpty(noverduedays)) {
								sb.append("<N_OVERDUE_DAYS>");
								sb.append(noverduedays);
								sb.append("</N_OVERDUE_DAYS>");
							}
						}
						if (taxobj.containsKey("c_drawback_opr")) {
							String cdrawbackopr = taxobj.getString("c_drawback_opr");
							if (StringUtils.isNotEmpty(cdrawbackopr)) {
								sb.append("<C_DRAWBACK_OPR>");
								sb.append(cdrawbackopr);
								sb.append("</C_DRAWBACK_OPR>");
							}
						}
						if (taxobj.containsKey("n_overdue_amt")) {
							String noverdueamt = taxobj.getString("n_overdue_amt");
							if (StringUtils.isNotEmpty(noverdueamt)) {
								sb.append("<N_OVERDUE_AMT>");
								sb.append(noverdueamt);
								sb.append("</N_OVERDUE_AMT>");
							}
						}
						if (taxobj.containsKey("c_com_tax_org")) {
							String ccomtaxorg = taxobj.getString("c_com_tax_org");
							if (StringUtils.isNotEmpty(ccomtaxorg)) {
								sb.append("<C_COM_TAX_ORG>");
								sb.append(ccomtaxorg);
								sb.append("</C_COM_TAX_ORG>");
							}
						}
						if (taxobj.containsKey("c_tax_belong_tm")) {
							String ctaxbelongtm = taxobj.getString("c_tax_belong_tm");
							if (StringUtils.isNotEmpty(ctaxbelongtm)) {
								sb.append("<C_TAX_BELONG_TM>");
								sb.append(ctaxbelongtm);
								sb.append("</C_TAX_BELONG_TM>");
							}
						}
						if (taxobj.containsKey("c_transfer_car_mrk")) {
							String ctransfercarmrk = taxobj.getString("c_transfer_car_mrk");
							if (StringUtils.isNotEmpty(ctransfercarmrk)) {
								sb.append("<C_TRANSFER_CAR_MRK>");
								sb.append(ctransfercarmrk);
								sb.append("</C_TRANSFER_CAR_MRK>");
							}
						}
						if (taxobj.containsKey("t_transfer_date")) {
							String ttransferdate = taxobj.getString("t_transfer_date");
							if (StringUtils.isNotEmpty(ttransferdate)) {
								sb.append("<T_TRANSFER_DATE>");
								sb.append(ttransferdate);
								sb.append("</T_TRANSFER_DATE>");
							}
						}
						if (taxobj.containsKey("c_pay_tax_mrk")) {
							String cpaytaxmrk = taxobj.getString("c_pay_tax_mrk");
							if (StringUtils.isNotEmpty(cpaytaxmrk)) {
								sb.append("<C_PAY_TAX_MRK>");
								sb.append(cpaytaxmrk);
								sb.append("</C_PAY_TAX_MRK>");
							}else{
								sb.append("<C_PAY_TAX_MRK>");
								sb.append("0");
								sb.append("</C_PAY_TAX_MRK>");
							}
						}
						if (taxobj.containsKey("c_tax_vch_typ")) {
							String ctaxvchtyp = taxobj.getString("c_tax_vch_typ");
							if (StringUtils.isNotEmpty(ctaxvchtyp)) {
								sb.append("<C_TAX_VCH_TYP>");
								sb.append(ctaxvchtyp);
								sb.append("</C_TAX_VCH_TYP>");
							}
						}
						if (taxobj.containsKey("c_tax_vch_no")) {
							String ctaxvchno = taxobj.getString("c_tax_vch_no");
							if (StringUtils.isNotEmpty(ctaxvchno)) {
								sb.append("<C_TAX_VCH_NO>");
								sb.append(ctaxvchno);
								sb.append("</C_TAX_VCH_NO>");
							}
						}
						if (taxobj.containsKey("c_brand_name")) {
							String cbrandname = taxobj.getString("c_brand_name");
							if (StringUtils.isNotEmpty(cbrandname)) {
								sb.append("<C_BRAND_NAME>");
								sb.append(cbrandname);
								sb.append("</C_BRAND_NAME>");
							}
						}
						if (taxobj.containsKey("c_model_code")) {
							String cmodelcode = taxobj.getString("c_model_code");
							if (StringUtils.isNotEmpty(cmodelcode)) {
								sb.append("<C_MODEL_CODE>");
								sb.append(cmodelcode);
								sb.append("</C_MODEL_CODE>");
							}
						}
						if (taxobj.containsKey("c_taxitem_cde")) {
							String ctaxitemcde = taxobj.getString("c_taxitem_cde");
							if (StringUtils.isNotEmpty(ctaxitemcde)) {
								sb.append("<C_TAXITEM_CDE>");
								sb.append(ctaxitemcde);
								sb.append("</C_TAXITEM_CDE>");
							}
						}
						if (taxobj.containsKey("c_pay_id")) {
							String cpayid = taxobj.getString("c_pay_id");
							if (StringUtils.isNotEmpty(cpayid)) {
								sb.append("<C_PAY_ID>");
								sb.append(cpayid);
								sb.append("</C_PAY_ID>");
							}
						}
						if (taxobj.containsKey("c_tax_org_nolocal")) {
							String ctaxorgnolocal = taxobj.getString("c_tax_org_nolocal");
							if (StringUtils.isNotEmpty(ctaxorgnolocal)) {
								sb.append("<C_TAX_ORG_NOLOCAL>");
								sb.append(ctaxorgnolocal);
								sb.append("</C_TAX_ORG_NOLOCAL>");
							}
						}
						if (taxobj.containsKey("c_pay_tax_flag")) {
							String cpaytaxflag = taxobj.getString("c_pay_tax_flag");
							if (StringUtils.isNotEmpty(cpaytaxflag)) {
								sb.append("<C_PAY_TAX_FLAG>");
								sb.append(cpaytaxflag);
								sb.append("</C_PAY_TAX_FLAG>");
							}else{
								sb.append("<C_PAY_TAX_FLAG>");
								sb.append("0");
								sb.append("</C_PAY_TAX_FLAG>");
							}
						}
						if("V7203".equals(transtype)){
							sb.append("</TAXATION>");
						}else{
							sb.append("</TAX_INFO>");
						}
					}
				}
			//********************************************************************************************************	
				if (bodyobj.containsKey("chkdata_tpf") || bodyobj.containsKey("chkdata_biz")) {
					
					JSONObject chkobj = null;
					if(isTpf){
						chkobj = bodyobj.getJSONObject("chkdata_tpf");
					}else{
						chkobj = bodyobj.getJSONObject("chkdata_biz");
					}
					
					
					if (!chkobj.isNullObject() && "Y".equals(ischkdata)) {
						sb.append("<CHKDATA>");
						if (chkobj.containsKey("c_check_status")) {
							String ccheckstatus = chkobj.getString("c_check_status");
							if (StringUtils.isNotEmpty(ccheckstatus)) {
								sb.append("<C_CHECK_STATUS>");
								sb.append(ccheckstatus);
								sb.append("</C_CHECK_STATUS>");
							}
						}
						if (chkobj.containsKey("c_query_cde")) {
							String cquerycde = chkobj.getString("c_query_cde");
							if (StringUtils.isNotEmpty(cquerycde)) {
								sb.append("<C_QUERY_CDE>");
								sb.append(cquerycde);
								sb.append("</C_QUERY_CDE>");
							}
						}
						if (chkobj.containsKey("c_check_question")) {
							String ccheckquestion = chkobj.getString("c_check_question");
							if (StringUtils.isNotEmpty(ccheckquestion)) {
								sb.append("<C_CHECK_QUESTION>");
								sb.append(ccheckquestion);
								sb.append("</C_CHECK_QUESTION>");
							}
						}
						if (chkobj.containsKey("c_check_answer")) {
							String ccheckanswer = chkobj.getString("c_check_answer");
							if (StringUtils.isNotEmpty(ccheckanswer)) {
								sb.append("<C_CHECK_ANSWER>");
								sb.append(ccheckanswer);
								sb.append("</C_CHECK_ANSWER>");
							}
						}
						sb.append("</CHKDATA>");
					}
				}
			
		///***************************************************************************************************************		
				if ("Y".equals(isoffer_spec_agmt_list)) {
					JSONArray jspArry = null;
					if(bodyobj.containsKey("offer_spec_agmt_list")){
						 jspArry = bodyobj.getJSONArray("offer_spec_agmt_list");
					}else if(bodyobj.containsKey("offer_spec_agmt_list_tpf")){
						 jspArry = bodyobj.getJSONArray("offer_spec_agmt_list_tpf");
					}else if(bodyobj.containsKey("offer_spec_agmt_list_biz")){
						 jspArry = bodyobj.getJSONArray("offer_spec_agmt_list_biz");
					}
					if(jspArry != null && jspArry.isArray() && jspArry.size() >0){

						sb.append("<OFFER_SPEC_AGMT_LIST>");
						for(int j=0 ;j <jspArry.size() ;j++){
							JSONObject jspojb = (JSONObject) jspArry.get(j);
							sb.append("<OFFER_SPEC_AGMT_DATA>");
							if (jspojb.containsKey("c_code")) {
								String ccode = jspojb.getString("c_code");
								if (StringUtils.isNotEmpty(ccode)) {
									sb.append("<C_CODE>");
									sb.append(ccode);
									sb.append("</C_CODE>");
								}
							}
							if (jspojb.containsKey("c_use_flag")) {
								String cuseflag = jspojb.getString("c_use_flag");
								if (StringUtils.isNotEmpty(cuseflag)) {
									sb.append("<C_USE_FLAG>");
									sb.append(cuseflag);
									sb.append("</C_USE_FLAG>");
								}
							}
							if (jspojb.containsKey("c_is_modify")) {
								String cismodify = jspojb.getString("c_is_modify");
								if (StringUtils.isNotEmpty(cismodify)) {
									sb.append("<C_IS_MODIFY>");
									sb.append(cismodify);
									sb.append("</C_IS_MODIFY>");
								}
							}
							if (jspojb.containsKey("c_spec")) {
								String cspec = jspojb.getString("c_spec");
								if (StringUtils.isNotEmpty(cspec)) {
									sb.append("<C_SPEC>");
									sb.append(cspec);
									sb.append("</C_SPEC>");
								}
							}
							sb.append("</OFFER_SPEC_AGMT_DATA>");
						}
						sb.append("</OFFER_SPEC_AGMT_LIST>");
					}
				}
	//****************************************************************************************************************			
//				if (bodyobj.containsKey("applicant")) {
//					JSONObject appcobj = bodyobj.getJSONObject("applicant");
//					if (!appcobj.isNullObject()) {
//
//						sb.append("<APPLICANT>");
//						if (appcobj.containsKey("c_app_cde")) {
//							String cappcde = appcobj.getString("c_app_cde");
//							if (StringUtils.isNotEmpty(cappcde)) {
//								sb.append("<C_APP_CDE>");
//								sb.append(cappcde);
//								sb.append("</C_APP_CDE>");
//							}
//						}
//						if (appcobj.containsKey("c_app_nme")) {
//							String cappnme = appcobj.getString("c_app_nme");
//							if (StringUtils.isNotEmpty(cappnme)) {
//								sb.append("<C_APP_NME>");
//								sb.append(cappnme);
//								sb.append("</C_APP_NME>");
//							}
//						}
//						if (appcobj.containsKey("c_clnt_mrk")) {
//							String cclntmrk = appcobj.getString("c_clnt_mrk");
//							if (StringUtils.isNotEmpty(cclntmrk)) {
//								sb.append("<C_CLNT_MRK>");
//								sb.append(cclntmrk);
//								sb.append("</C_CLNT_MRK>");
//							}
//						}
//						if (appcobj.containsKey("c_applicant_typ")) {
//							String capplicanttyp = appcobj.getString("c_applicant_typ");
//							if (StringUtils.isNotEmpty(capplicanttyp)) {
//								sb.append("<C_APPLICANT_TYP>");
//								sb.append(capplicanttyp);
//								sb.append("</C_APPLICANT_TYP>");
//							}
//						}
//						if (appcobj.containsKey("c_certf_cls")) {
//							String ccertfcls = appcobj.getString("c_certf_cls");
//							if (StringUtils.isNotEmpty(ccertfcls)) {
//								sb.append("<C_CERTF_CLS>");
//								sb.append(ccertfcls);
//								sb.append("</C_CERTF_CLS>");
//							}
//						}
//						if (appcobj.containsKey("c_certf_cde")) {
//							String ccertfcde = appcobj.getString("c_certf_cde");
//							if (StringUtils.isNotEmpty(ccertfcde)) {
//								sb.append("<C_CERTF_CDE>");
//								sb.append(ccertfcde);
//								sb.append("</C_CERTF_CDE>");
//							}
//						}
//						if (appcobj.containsKey("c_clnt_addr")) {
//							String cclntaddr = appcobj.getString("c_clnt_addr");
//							if (StringUtils.isNotEmpty(cclntaddr)) {
//								sb.append("<C_CLNT_ADDR>");
//								sb.append(cclntaddr);
//								sb.append("</C_CLNT_ADDR>");
//							}
//						}
//						if (appcobj.containsKey("c_country")) {
//							String ccountry = appcobj.getString("c_country");
//							if (StringUtils.isNotEmpty(ccountry)) {
//								sb.append("<C_COUNTRY>");
//								sb.append(ccountry);
//								sb.append("</C_COUNTRY>");
//							}
//						}
//						if (appcobj.containsKey("c_cus_type")) {
//							String ccustype = appcobj.getString("c_cus_type");
//							if (StringUtils.isNotEmpty(ccustype)) {
//								sb.append("<C_CUS_TYPE>");
//								sb.append(ccustype);
//								sb.append("</C_CUS_TYPE>");
//							}
//						}
//						if (appcobj.containsKey("c_mobile")) {
//							String cmobile = appcobj.getString("c_mobile");
//							if (StringUtils.isNotEmpty(cmobile)) {
//								sb.append("<C_MOBILE>");
//								sb.append(cmobile);
//								sb.append("</C_MOBILE>");
//							}
//						}
//						if (appcobj.containsKey("c_grp_flag")) {
//							String cgrpflag = appcobj.getString("c_grp_flag");
//							if (StringUtils.isNotEmpty(cgrpflag)) {
//								sb.append("<C_GRP_FLAG>");
//								sb.append(cgrpflag);
//								sb.append("</C_GRP_FLAG>");
//							}
//						}
//						if (appcobj.containsKey("c_cust_risk_rank")) {
//							String ccustriskrank = appcobj.getString("c_cust_risk_rank");
//							if (StringUtils.isNotEmpty(ccustriskrank)) {
//								sb.append("<C_CUST_RISK_RANK>");
//								sb.append(ccustriskrank);
//								sb.append("</C_CUST_RISK_RANK>");
//							}
//						}
//						if (appcobj.containsKey("c_ply_typ")) {
//							String cplytyp = appcobj.getString("c_ply_typ");
//							if (StringUtils.isNotEmpty(cplytyp)) {
//								sb.append("<C_PLY_TYP>");
//								sb.append(cplytyp);
//								sb.append("</C_PLY_TYP>");
//							}
//						}
//						if (appcobj.containsKey("c_tel")) {
//							String ctel = appcobj.getString("c_tel");
//							if (StringUtils.isNotEmpty(ctel)) {
//								sb.append("<C_TEL>");
//								sb.append(ctel);
//								sb.append("</C_TEL>");
//							}
//						}
//						if (appcobj.containsKey("c_email_code")) {
//							String cemailcode = appcobj.getString("c_email_code");
//							if (StringUtils.isNotEmpty(cemailcode)) {
//								sb.append("<C_EMAIL_CODE>");
//								sb.append(cemailcode);
//								sb.append("</C_EMAIL_CODE>");
//							}
//						}
//						if (appcobj.containsKey("c_transactor_name")) {
//							String ctransactorname = appcobj.getString("c_transactor_name");
//							if (StringUtils.isNotEmpty(ctransactorname)) {
//								sb.append("<C_TRANSACTOR_NAME>");
//								sb.append(ctransactorname);
//								sb.append("</C_TRANSACTOR_NAME>");
//							}
//						}
//						if (appcobj.containsKey("c_transactor_mobile")) {
//							String ctransactormobile = appcobj.getString("c_transactor_mobile");
//							if (StringUtils.isNotEmpty(ctransactormobile)) {
//								sb.append("<C_TRANSACTOR_MOBILE>");
//								sb.append(ctransactormobile);
//								sb.append("</C_TRANSACTOR_MOBILE>");
//							}
//						}
//						if (appcobj.containsKey("c_transactor_email")) {
//							String ctransactoremail = appcobj.getString("c_transactor_email");
//							if (StringUtils.isNotEmpty(ctransactoremail)) {
//								sb.append("<C_TRANSACTOR_EMAIL>");
//								sb.append(ctransactoremail);
//								sb.append("</C_TRANSACTOR_EMAIL>");
//							}
//						}
//						if (appcobj.containsKey("c_occup_cde")) {
//							String coccupcde = appcobj.getString("c_occup_cde");
//							if (StringUtils.isNotEmpty(coccupcde)) {
//								sb.append("<C_OCCUP_CDE>");
//								sb.append(coccupcde);
//								sb.append("</C_OCCUP_CDE>");
//							}
//						}
//						if (appcobj.containsKey("c_legal_nme")) {
//							String clegalnme = appcobj.getString("c_legal_nme");
//							if (StringUtils.isNotEmpty(clegalnme)) {
//								sb.append("<C_LEGAL_NME>");
//								sb.append(clegalnme);
//								sb.append("</C_LEGAL_NME>");
//							}
//						}
//						if (appcobj.containsKey("c_transactor_no")) {
//							String ctransactorno = appcobj.getString("c_transactor_no");
//							if (StringUtils.isNotEmpty(ctransactorno)) {
//								sb.append("<C_TRANSACTOR_NO>");
//								sb.append(ctransactorno);
//								sb.append("</C_TRANSACTOR_NO>");
//							}
//						}
//						if (appcobj.containsKey("c_transactor_no_typ")) {
//							String ctransactornotyp = appcobj.getString("c_transactor_no_typ");
//							if (StringUtils.isNotEmpty(ctransactornotyp)) {
//								sb.append("<C_TRANSACTOR_NO_TYP>");
//								sb.append(ctransactornotyp);
//								sb.append("</C_TRANSACTOR_NO_TYP>");
//							}
//						}
//						if (appcobj.containsKey("c_rel_cde")) {
//							String crelcde = appcobj.getString("c_rel_cde");
//							if (StringUtils.isNotEmpty(crelcde)) {
//								sb.append("<C_REL_CDE>");
//								sb.append(crelcde);
//								sb.append("</C_REL_CDE>");
//							}
//						}
//						if (appcobj.containsKey("c_rel_ben")) {
//							String crelben = appcobj.getString("c_rel_ben");
//							if (StringUtils.isNotEmpty(crelben)) {
//								sb.append("<C_REL_BEN>");
//								sb.append(crelben);
//								sb.append("</C_REL_BEN>");
//							}
//						}
//						if (appcobj.containsKey("c_suffix_addr")) {
//							String csuffixaddr = appcobj.getString("c_suffix_addr");
//							if (StringUtils.isNotEmpty(csuffixaddr)) {
//								sb.append("<C_SUFFIX_ADDR>");
//								sb.append(csuffixaddr);
//								sb.append("</C_SUFFIX_ADDR>");
//							}
//						}
//						if (appcobj.containsKey("c_zip_cde")) {
//							String czipcde = appcobj.getString("c_zip_cde");
//							if (StringUtils.isNotEmpty(czipcde)) {
//								sb.append("<C_ZIP_CDE>");
//								sb.append(czipcde);
//								sb.append("</C_ZIP_CDE>");
//							}
//						}
//						if (appcobj.containsKey("c_country_nam")) {
//							String ccountrynam = appcobj.getString("c_country_nam");
//							if (StringUtils.isNotEmpty(ccountrynam)) {
//								sb.append("<C_COUNTRY_NAM>");
//								sb.append(ccountrynam);
//								sb.append("</C_COUNTRY_NAM>");
//							}
//						}
//						sb.append("</APPLICANT>");
//					}
//				}
		//*********************************************************************************************************		
				if (bodyobj.containsKey("driver_list") && "Y".equals(isdriver_list)) {
					JSONArray driArry = bodyobj.getJSONArray("driver_list");
					if(driArry.isArray() && driArry != null && driArry.size() >0){

						sb.append("<DRIVER_LIST>");
						for(int z=0 ;z <driArry.size() ;z++){
							JSONObject driojb = (JSONObject) driArry.get(z);
							sb.append("<DRIVER>");
							if (driojb.containsKey("n_seq_no")) {
								String nseqno = driojb.getString("n_seq_no");
								if (StringUtils.isNotEmpty(nseqno)) {
									sb.append("<N_SEQ_NO>");
									sb.append(nseqno);
									sb.append("</N_SEQ_NO>");
								}
							}
							if (driojb.containsKey("c_drv_nme")) {
								String cdrvnme = driojb.getString("c_drv_nme");
								if (StringUtils.isNotEmpty(cdrvnme)) {
									sb.append("<C_DRV_NME>");
									sb.append(cdrvnme);
									sb.append("</C_DRV_NME>");
								}
							}
							if (driojb.containsKey("c_drv_lcn_no")) {
								String cdrvlcnno = driojb.getString("c_drv_lcn_no");
								if (StringUtils.isNotEmpty(cdrvlcnno)) {
									sb.append("<C_DRV_LCN_NO>");
									sb.append(cdrvlcnno);
									sb.append("</C_DRV_LCN_NO>");
								}
							}
							if (driojb.containsKey("c_gendor_cde")) {
								String cgendorcde = driojb.getString("c_gendor_cde");
								if (StringUtils.isNotEmpty(cgendorcde)) {
									sb.append("<C_GENDOR_CDE>");
									sb.append(cgendorcde);
									sb.append("</C_GENDOR_CDE>");
								}
							}
							if (driojb.containsKey("c_birthday")) {
								String cbirthday = driojb.getString("c_birthday");
								if (StringUtils.isNotEmpty(cbirthday)) {
									sb.append("<C_BIRTHDAY>");
									sb.append(cbirthday);
									sb.append("</C_BIRTHDAY>");
								}
							}
							if (driojb.containsKey("c_drv_lcn_issue_date")) {
								String cdrvlcnissuedate = driojb.getString("c_drv_lcn_issue_date");
								if (StringUtils.isNotEmpty(cdrvlcnissuedate)) {
									sb.append("<C_DRV_LCN_ISSUE_DATE>");
									sb.append(cdrvlcnissuedate);
									sb.append("</C_DRV_LCN_ISSUE_DATE>");
								}
							}
							if (driojb.containsKey("c_allowed_vhl_typ")) {
								String callowedvhltyp = driojb.getString("c_allowed_vhl_typ");
								if (StringUtils.isNotEmpty(callowedvhltyp)) {
									sb.append("<C_ALLOWED_VHL_TYP>");
									sb.append(callowedvhltyp);
									sb.append("</C_ALLOWED_VHL_TYP>");
								}
							}
							if (driojb.containsKey("c_license_status_code")) {
								String clicensestatuscode = driojb.getString("c_license_status_code");
								if (StringUtils.isNotEmpty(clicensestatuscode)) {
									sb.append("<C_LICENSE_STATUS_CODE>");
									sb.append(clicensestatuscode);
									sb.append("</C_LICENSE_STATUS_CODE>");
								}
							}
							sb.append("</DRIVER>");
						}
						sb.append("</DRIVER_LIST>");
					}
				}
		//*****************************************************************************************************************
//				if (bodyobj.containsKey("driver")) {
//					JSONObject driverobj = bodyobj.getJSONObject("driver");
//					sb.append("<DRIVER>");
//					if (!driverobj.isNullObject()) {
//						
//						if (driverobj.containsKey("n_seq_no")) {
//							String nseqno = driverobj.getString("n_seq_no");
//							if (StringUtils.isNotEmpty(nseqno)) {
//								sb.append("<N_SEQ_NO>");
//								sb.append(nseqno);
//								sb.append("</N_SEQ_NO>");
//							}
//						}
//						if (driverobj.containsKey("c_drv_nme")) {
//							String cdrvnme = driverobj.getString("c_drv_nme");
//							if (StringUtils.isNotEmpty(cdrvnme)) {
//								sb.append("<C_DRV_NME>");
//								sb.append(cdrvnme);
//								sb.append("</C_DRV_NME>");
//							}
//						}
//						
//						if (driverobj.containsKey("c_drv_lcn_no")) {
//							String cdrvlcnno = driverobj.getString("c_drv_lcn_no");
//							if (StringUtils.isNotEmpty(cdrvlcnno)) {
//								sb.append("<C_DRV_LCN_NO>");
//								sb.append(cdrvlcnno);
//								sb.append("</C_DRV_LCN_NO>");
//							}
//						}
//						if (driverobj.containsKey("c_gendor_cde")) {
//							String cgendorcde = driverobj.getString("c_gendor_cde");
//							if (StringUtils.isNotEmpty(cgendorcde)) {
//								sb.append("<C_GENDOR_CDE>");
//								sb.append(cgendorcde);
//								sb.append("</C_GENDOR_CDE>");
//							}
//						}
//						if (driverobj.containsKey("c_birthday")) {
//							String cbirthday = driverobj.getString("c_birthday");
//							if (StringUtils.isNotEmpty(cbirthday)) {
//								sb.append("<C_BIRTHDAY>");
//								sb.append(cbirthday);
//								sb.append("</C_BIRTHDAY>");
//							}
//						}
//						if (driverobj.containsKey("c_drv_lcn_issue_date")) {
//							String cdrvlcnissuedate = driverobj.getString("c_drv_lcn_issue_date");
//							if (StringUtils.isNotEmpty(cdrvlcnissuedate)) {
//								sb.append("<C_DRV_LCN_ISSUE_DATE>");
//								sb.append(cdrvlcnissuedate);
//								sb.append("</C_DRV_LCN_ISSUE_DATE>");
//							}
//						}
//						if (driverobj.containsKey("c_allowed_vhl_typ")) {
//							String callowedvhltyp = driverobj.getString("c_allowed_vhl_typ");
//							if (StringUtils.isNotEmpty(callowedvhltyp)) {
//								sb.append("<C_ALLOWED_VHL_TYP>");
//								sb.append(callowedvhltyp);
//								sb.append("</C_ALLOWED_VHL_TYP>");
//							}
//						}
//						if (driverobj.containsKey("c_license_status_code")) {
//							String clicensestatuscode = driverobj.getString("c_license_status_code");
//							if (StringUtils.isNotEmpty(clicensestatuscode)) {
//								sb.append("<C_LICENSE_STATUS_CODE>");
//								sb.append(clicensestatuscode);
//								sb.append("</C_LICENSE_STATUS_CODE>");
//							}
//						}
//						
//					}
//					
//					sb.append("</DRIVER>");
//				
//				}
//				
//		
	//*******************************************************************************************************************		
//				
//				
//				if (bodyobj.containsKey("cvrg_data")) {
//					JSONObject cvrgDataobj = bodyobj.getJSONObject("cvrg_data");
//					sb.append("<CVRG_DATA>");
//					if (cvrgDataobj.containsKey("n_seq_no")) {
//						String nseqno = cvrgDataobj.getString("n_seq_no");
//						if (StringUtils.isNotEmpty(nseqno)) {
//							sb.append("<N_SEQ_NO>");
//							sb.append(nseqno);
//							sb.append("</N_SEQ_NO>");
//						}
//					}
//					if (cvrgDataobj.containsKey("c_cvrg_no")) {
//						String ccvrgno = cvrgDataobj.getString("c_cvrg_no");
//						if (StringUtils.isNotEmpty(ccvrgno)) {
//							sb.append("<C_CVRG_NO>");
//							sb.append(ccvrgno);
//							sb.append("</C_CVRG_NO>");
//						}
//					}
//					if (cvrgDataobj.containsKey("c_per_amt")) {
//						String cperamt = cvrgDataobj.getString("c_per_amt");
//						if (StringUtils.isNotEmpty(cperamt)) {
//							sb.append("<C_PER_AMT>");
//							sb.append(cperamt);
//							sb.append("</C_PER_AMT>");
//						}
//					}
//					if (cvrgDataobj.containsKey("n_amt")) {
//						String namt = cvrgDataobj.getString("n_amt");
//						if (StringUtils.isNotEmpty(namt)) {
//							sb.append("<N_AMT>");
//							sb.append(namt);
//							sb.append("</N_AMT>");
//						}
//					}
//					
//					if (cvrgDataobj.containsKey("n_dduct_rate")) {
//						String ndductrate = cvrgDataobj.getString("n_dduct_rate");
//						if (StringUtils.isNotEmpty(ndductrate)) {
//							sb.append("<N_DDUCT_RATE>");
//							sb.append(ndductrate);
//							sb.append("</N_DDUCT_RATE>");
//						}
//					}
//					
//					if (cvrgDataobj.containsKey("c_glass_type")) {
//						String cglasstype = cvrgDataobj.getString("c_glass_type");
//						if (StringUtils.isNotEmpty(cglasstype)) {
//							sb.append("<C_GLASS_TYPE>");
//							sb.append(cglasstype);
//							sb.append("</C_GLASS_TYPE>");
//						}
//					}
//					if (cvrgDataobj.containsKey("n_base_prm")) {
//						String nbaseprm = cvrgDataobj.getString("n_base_prm");
//						if (StringUtils.isNotEmpty(nbaseprm)) {
//							sb.append("<N_BASE_PRM>");
//							sb.append(nbaseprm);
//							sb.append("</N_BASE_PRM>");
//						}
//					}
//					
//					if (cvrgDataobj.containsKey("n_prm")) {
//						String nprm = cvrgDataobj.getString("n_prm");
//						if (StringUtils.isNotEmpty(nprm)) {
//							sb.append("<N_PRM>");
//							sb.append(nprm);
//							sb.append("</N_PRM>");
//						}
//					}
//					if (cvrgDataobj.containsKey("n_rate")) {
//						String nrate = cvrgDataobj.getString("n_rate");
//						if (StringUtils.isNotEmpty(nrate)) {
//							sb.append("<N_RATE>");
//							sb.append(nrate);
//							sb.append("</N_RATE>");
//						}
//					}
//					
//					if (cvrgDataobj.containsKey("n_cvrg_risk")) {
//						String ncvrgrisk = cvrgDataobj.getString("n_cvrg_risk");
//						if (StringUtils.isNotEmpty(ncvrgrisk)) {
//							sb.append("<N_CVRG_RISK>");
//							sb.append(ncvrgrisk);
//							sb.append("</N_CVRG_RISK>");
//						}
//					}
//					sb.append("</CVRG_DATA>");
//				}
				
				
				
		//*******************************************************************************************************************		
				if (bodyobj.containsKey("taxation")) {
					JSONObject taxaobj = bodyobj.getJSONObject("taxation");
					if (!taxaobj.isNullObject()) {

						sb.append("<TAXATION>");
						if (taxaobj.containsKey("c_calc_tax_flag")) {
							String ccalctaxflag = taxaobj.getString("c_calc_tax_flag");
							if (StringUtils.isNotEmpty(ccalctaxflag)) {
								sb.append("<C_CALC_TAX_FLAG>");
								sb.append(ccalctaxflag);
								sb.append("</C_CALC_TAX_FLAG>");
							}
						}
						if (taxaobj.containsKey("c_declare_status")) {
							String cdeclarestatus = taxaobj.getString("c_declare_status");
							if (StringUtils.isNotEmpty(cdeclarestatus)) {
								sb.append("<C_DECLARE_STATUS>");
								sb.append(cdeclarestatus);
								sb.append("</C_DECLARE_STATUS>");
							}
						}
						if (taxaobj.containsKey("c_tax_sign")) {
							String ctaxsign = taxaobj.getString("c_tax_sign");
							if (StringUtils.isNotEmpty(ctaxsign)) {
								sb.append("<C_TAX_SIGN>");
								sb.append(ctaxsign);
								sb.append("</C_TAX_SIGN>");
							}
						}
						if (taxaobj.containsKey("c_tax_item_cde")) {
							String ctaxitemcde = taxaobj.getString("c_tax_item_cde");
							if (StringUtils.isNotEmpty(ctaxitemcde)) {
								sb.append("<C_TAX_ITEM_CDE>");
								sb.append(ctaxitemcde);
								sb.append("</C_TAX_ITEM_CDE>");
							}
						}
						if (taxaobj.containsKey("c_free_type")) {
							String cfreetype = taxaobj.getString("c_free_type");
							if (StringUtils.isNotEmpty(cfreetype)) {
								sb.append("<C_FREE_TYPE>");
								sb.append(cfreetype);
								sb.append("</C_FREE_TYPE>");
							}
						}
						if (taxaobj.containsKey("c_taxpayer_nme")) {
							String ctaxpayernme = taxaobj.getString("c_taxpayer_nme");
							if (StringUtils.isNotEmpty(ctaxpayernme)) {
								sb.append("<C_TAXPAYER_NME>");
								sb.append(ctaxpayernme);
								sb.append("</C_TAXPAYER_NME>");
							}
						}
						if (taxaobj.containsKey("c_taxpayer_cert_no")) {
							String ctaxpayercertno = taxaobj.getString("c_taxpayer_cert_no");
							if (StringUtils.isNotEmpty(ctaxpayercertno)) {
								sb.append("<C_TAXPAYER_CERT_NO>");
								sb.append(ctaxpayercertno);
								sb.append("</C_TAXPAYER_CERT_NO>");
							}
						}
						if (taxaobj.containsKey("c_taxpayer_id")) {
							String ctaxpayerid = taxaobj.getString("c_taxpayer_id");
							if (StringUtils.isNotEmpty(ctaxpayerid)) {
								sb.append("<C_TAXPAYER_ID>");
								sb.append(ctaxpayerid);
								sb.append("</C_TAXPAYER_ID>");
							}
						}
						if (taxaobj.containsKey("c_abate_mrk")) {
							String cabatemrk = taxaobj.getString("c_abate_mrk");
							if (StringUtils.isNotEmpty(cabatemrk)) {
								sb.append("<C_ABATE_MRK>");
								sb.append(cabatemrk);
								sb.append("</C_ABATE_MRK>");
							}
						}
						if (taxaobj.containsKey("c_abate_rsn")) {
							String cabatersn = taxaobj.getString("c_abate_rsn");
							if (StringUtils.isNotEmpty(cabatersn)) {
								sb.append("<C_ABATE_RSN>");
								sb.append(cabatersn);
								sb.append("</C_ABATE_RSN>");
							}
						}
						if (taxaobj.containsKey("c_abate_prop")) {
							String cabateprop = taxaobj.getString("c_abate_prop");
							if (StringUtils.isNotEmpty(cabateprop)) {
								sb.append("<C_ABATE_PROP>");
								sb.append(cabateprop);
								sb.append("</C_ABATE_PROP>");
							}
						}
						if (taxaobj.containsKey("c_tax_authorities")) {
							String ctaxauthorities = taxaobj.getString("c_tax_authorities");
							if (StringUtils.isNotEmpty(ctaxauthorities)) {
								sb.append("<C_TAX_AUTHORITIES>");
								sb.append(ctaxauthorities);
								sb.append("</C_TAX_AUTHORITIES>");
							}
						}
						if (taxaobj.containsKey("c_tax_payment_recpt_no")) {
							String ctaxpaymentrecptno = taxaobj.getString("c_tax_payment_recpt_no");
							if (StringUtils.isNotEmpty(ctaxpaymentrecptno)) {
								sb.append("<C_TAX_PAYMENT_RECPT_NO>");
								sb.append(ctaxpaymentrecptno);
								sb.append("</C_TAX_PAYMENT_RECPT_NO>");
							}
						}
						if (taxaobj.containsKey("c_tax_unit")) {
							String ctaxunit = taxaobj.getString("c_tax_unit");
							if (StringUtils.isNotEmpty(ctaxunit)) {
								sb.append("<C_TAX_UNIT>");
								sb.append(ctaxunit);
								sb.append("</C_TAX_UNIT>");
							}
						}
						if (taxaobj.containsKey("c_curb_wt")) {
							String ccurbwt = taxaobj.getString("c_curb_wt");
							if (StringUtils.isNotEmpty(ccurbwt)) {
								sb.append("<C_CURB_WT>");
								sb.append(ccurbwt);
								sb.append("</C_CURB_WT>");
							}
						}
						if (taxaobj.containsKey("c_last_tax_year")) {
							String clasttaxyear = taxaobj.getString("c_last_tax_year");
							if (StringUtils.isNotEmpty(clasttaxyear)) {
								sb.append("<C_LAST_TAX_YEAR>");
								sb.append(clasttaxyear);
								sb.append("</C_LAST_TAX_YEAR>");
							}
						}
						if (taxaobj.containsKey("c_last_sali_end_date")) {
							String clastsalienddate = taxaobj.getString("c_last_sali_end_date");
							if (StringUtils.isNotEmpty(clastsalienddate)) {
								sb.append("<C_LAST_SALI_END_DATE>");
								sb.append(clastsalienddate);
								sb.append("</C_LAST_SALI_END_DATE>");
							}
						}
						if (taxaobj.containsKey("n_ann_unit_tax_amt")) {
							String nannunittaxamt = taxaobj.getString("n_ann_unit_tax_amt");
							if (StringUtils.isNotEmpty(nannunittaxamt)) {
								sb.append("<N_ANN_UNIT_TAX_AMT>");
								sb.append(nannunittaxamt);
								sb.append("</N_ANN_UNIT_TAX_AMT>");
							}
						}
						if (taxaobj.containsKey("c_taxable_amt")) {
							String ctaxableamt = taxaobj.getString("c_taxable_amt");
							if (StringUtils.isNotEmpty(ctaxableamt)) {
								sb.append("<C_TAXABLE_AMT>");
								sb.append(ctaxableamt);
								sb.append("</C_TAXABLE_AMT>");
							}
						}
						if (taxaobj.containsKey("c_abate_amt")) {
							String cabateamt = taxaobj.getString("c_abate_amt");
							if (StringUtils.isNotEmpty(cabateamt)) {
								sb.append("<C_ABATE_AMT>");
								sb.append(cabateamt);
								sb.append("</C_ABATE_AMT>");
							}
						}
						if (taxaobj.containsKey("n_last_year")) {
							String nlastyear = taxaobj.getString("n_last_year");
							if (StringUtils.isNotEmpty(nlastyear)) {
								sb.append("<N_LAST_YEAR>");
								sb.append(nlastyear);
								sb.append("</N_LAST_YEAR>");
							}
						}
						if (taxaobj.containsKey("n_overdue_amt")) {
							String noverdueamt = taxaobj.getString("n_overdue_amt");
							if (StringUtils.isNotEmpty(noverdueamt)) {
								sb.append("<N_OVERDUE_AMT>");
								sb.append(noverdueamt);
								sb.append("</N_OVERDUE_AMT>");
							}
						}
						if (taxaobj.containsKey("n_overdue_days")) {
							String noverduedays = taxaobj.getString("n_overdue_days");
							if (StringUtils.isNotEmpty(noverduedays)) {
								sb.append("<N_OVERDUE_DAYS>");
								sb.append(noverduedays);
								sb.append("</N_OVERDUE_DAYS>");
							}
						}
						if (taxaobj.containsKey("n_overdue_fine_prop")) {
							String noverduefineprop = taxaobj.getString("n_overdue_fine_prop");
							if (StringUtils.isNotEmpty(noverduefineprop)) {
								sb.append("<N_OVERDUE_FINE_PROP>");
								sb.append(noverduefineprop);
								sb.append("</N_OVERDUE_FINE_PROP>");
							}
						}
						if (taxaobj.containsKey("n_agg_tax")) {
							String naggtax = taxaobj.getString("n_agg_tax");
							if (StringUtils.isNotEmpty(naggtax)) {
								sb.append("<N_AGG_TAX>");
								sb.append(naggtax);
								sb.append("</N_AGG_TAX>");
							}
						}
						if (taxaobj.containsKey("c_decleare_date")) {
							String cdeclearedate = taxaobj.getString("c_decleare_date");
							if (StringUtils.isNotEmpty(cdeclearedate)) {
								sb.append("<C_DECLEARE_DATE>");
								sb.append(cdeclearedate);
								sb.append("</C_DECLEARE_DATE>");
							}
						}
						if (taxaobj.containsKey("c_vs_tax_mrk")) {
							String cvstaxmrk = taxaobj.getString("c_vs_tax_mrk");
							if (StringUtils.isNotEmpty(cvstaxmrk)) {
								sb.append("<C_VS_TAX_MRK>");
								sb.append(cvstaxmrk);
								sb.append("</C_VS_TAX_MRK>");
							}
						}
						if (taxaobj.containsKey("c_paytax_flag")) {
							String cpaytaxflag = taxaobj.getString("c_paytax_flag");
							if (StringUtils.isNotEmpty(cpaytaxflag)) {
								sb.append("<C_PAYTAX_FLAG>");
								sb.append(cpaytaxflag);
								sb.append("</C_PAYTAX_FLAG>");
							}
						}
						if (taxaobj.containsKey("c_certificate_date")) {
							String ccertificatedate = taxaobj.getString("c_certificate_date");
							if (StringUtils.isNotEmpty(ccertificatedate)) {
								sb.append("<C_CERTIFICATE_DATE>");
								sb.append(ccertificatedate);
								sb.append("</C_CERTIFICATE_DATE>");
							}
						}
						if (taxaobj.containsKey("n_charge_amt")) {
							String nchargeamt = taxaobj.getString("n_charge_amt");
							if (StringUtils.isNotEmpty(nchargeamt)) {
								sb.append("<N_CHARGE_AMT>");
								sb.append(nchargeamt);
								sb.append("</N_CHARGE_AMT>");
							}
						}
						if (taxaobj.containsKey("n_charge_prop")) {
							String nchargeprop = taxaobj.getString("n_charge_prop");
							if (StringUtils.isNotEmpty(nchargeprop)) {
								sb.append("<N_CHARGE_PROP>");
								sb.append(nchargeprop);
								sb.append("</N_CHARGE_PROP>");
							}
						}
						if (taxaobj.containsKey("n_taxable_months")) {
							String ntaxablemonths = taxaobj.getString("n_taxable_months");
							if (StringUtils.isNotEmpty(ntaxablemonths)) {
								sb.append("<N_TAXABLE_MONTHS>");
								sb.append(ntaxablemonths);
								sb.append("</N_TAXABLE_MONTHS>");
							}
						}
						if (taxaobj.containsKey("c_taxpayer_addr")) {
							String ctaxpayeraddr = taxaobj.getString("c_taxpayer_addr");
							if (StringUtils.isNotEmpty(ctaxpayeraddr)) {
								sb.append("<C_TAXPAYER_ADDR>");
								sb.append(ctaxpayeraddr);
								sb.append("</C_TAXPAYER_ADDR>");
							}
						}
						if (taxaobj.containsKey("c_taxpayer_cert_typ")) {
							String ctaxpayercerttyp = taxaobj.getString("c_taxpayer_cert_typ");
							if (StringUtils.isNotEmpty(ctaxpayercerttyp)) {
								sb.append("<C_TAXPAYER_CERT_TYP>");
								sb.append(ctaxpayercerttyp);
								sb.append("</C_TAXPAYER_CERT_TYP>");
							}
						}
						if (taxaobj.containsKey("c_paytax_typ")) {
							String cpaytaxtyp = taxaobj.getString("c_paytax_typ");
							if (StringUtils.isNotEmpty(cpaytaxtyp)) {
								sb.append("<C_PAYTAX_TYP>");
								sb.append(cpaytaxtyp);
								sb.append("</C_PAYTAX_TYP>");
							}
						}
						if (taxaobj.containsKey("n_exhaust_capacity")) {
							String nexhaustcapacity = taxaobj.getString("n_exhaust_capacity");
							if (StringUtils.isNotEmpty(nexhaustcapacity)) {
								sb.append("<N_EXHAUST_CAPACITY>");
								sb.append(nexhaustcapacity);
								sb.append("</N_EXHAUST_CAPACITY>");
							}
						}
						if (taxaobj.containsKey("c_vehicle_number")) {
							String cvehiclenumber = taxaobj.getString("c_vehicle_number");
							if (StringUtils.isNotEmpty(cvehiclenumber)) {
								sb.append("<C_VEHICLE_NUMBER>");
								sb.append(cvehiclenumber);
								sb.append("</C_VEHICLE_NUMBER>");
							}
						}
						if (taxaobj.containsKey("t_bill_date")) {
							String tbilldate = taxaobj.getString("t_bill_date");
							if (StringUtils.isNotEmpty(tbilldate)) {
								sb.append("<T_BILL_DATE>");
								sb.append(tbilldate);
								sb.append("</T_BILL_DATE>");
							}
						}
						if (taxaobj.containsKey("n_last_year_taxable_months")) {
							String nlastyeartaxablemonths = taxaobj.getString("n_last_year_taxable_months");
							if (StringUtils.isNotEmpty(nlastyeartaxablemonths)) {
								sb.append("<N_LAST_YEAR_TAXABLE_MONTHS>");
								sb.append(nlastyeartaxablemonths);
								sb.append("</N_LAST_YEAR_TAXABLE_MONTHS>");
							}
						}
						if (taxaobj.containsKey("n_befor_tax")) {
							String nbefortax = taxaobj.getString("n_befor_tax");
							if (StringUtils.isNotEmpty(nbefortax)) {
								sb.append("<N_BEFOR_TAX>");
								sb.append(nbefortax);
								sb.append("</N_BEFOR_TAX>");
							}
						}
						if (taxaobj.containsKey("n_befor_unit_tax")) {
							String nbeforunittax = taxaobj.getString("n_befor_unit_tax");
							if (StringUtils.isNotEmpty(nbeforunittax)) {
								sb.append("<N_BEFOR_UNIT_TAX>");
								sb.append(nbeforunittax);
								sb.append("</N_BEFOR_UNIT_TAX>");
							}
						}
						if (taxaobj.containsKey("c_tax_eff_bgn_tm")) {
							String ctaxeffbgntm = taxaobj.getString("c_tax_eff_bgn_tm");
							if (StringUtils.isNotEmpty(ctaxeffbgntm)) {
								sb.append("<C_TAX_EFF_BGN_TM>");
								sb.append(ctaxeffbgntm);
								sb.append("</C_TAX_EFF_BGN_TM>");
							}
						}
						if (taxaobj.containsKey("c_tax_eff_end_tm")) {
							String ctaxeffendtm = taxaobj.getString("c_tax_eff_end_tm");
							if (StringUtils.isNotEmpty(ctaxeffendtm)) {
								sb.append("<C_TAX_EFF_END_TM>");
								sb.append(ctaxeffendtm);
								sb.append("</C_TAX_EFF_END_TM>");
							}
						}
						if (taxaobj.containsKey("c_tax_belong_tm")) {
							String ctaxbelongtm = taxaobj.getString("c_tax_belong_tm");
							if (StringUtils.isNotEmpty(ctaxbelongtm)) {
								sb.append("<C_TAX_BELONG_TM>");
								sb.append(ctaxbelongtm);
								sb.append("</C_TAX_BELONG_TM>");
							}
						}
						if (taxaobj.containsKey("c_tax_vch_typ")) {
							String ctaxvchtyp = taxaobj.getString("c_tax_vch_typ");
							if (StringUtils.isNotEmpty(ctaxvchtyp)) {
								sb.append("<C_TAX_VCH_TYP>");
								sb.append(ctaxvchtyp);
								sb.append("</C_TAX_VCH_TYP>");
							}
						}
						if (taxaobj.containsKey("c_tax_vch_no")) {
							String ctaxvchno = taxaobj.getString("c_tax_vch_no");
							if (StringUtils.isNotEmpty(ctaxvchno)) {
								sb.append("<C_TAX_VCH_NO>");
								sb.append(ctaxvchno);
								sb.append("</C_TAX_VCH_NO>");
							}
						}
						if (taxaobj.containsKey("c_free_tax_org")) {
							String cfreetaxorg = taxaobj.getString("c_free_tax_org");
							if (StringUtils.isNotEmpty(cfreetaxorg)) {
								sb.append("<C_FREE_TAX_ORG>");
								sb.append(cfreetaxorg);
								sb.append("</C_FREE_TAX_ORG>");
							}
						}
						if (taxaobj.containsKey("c_transfer_car_mrk")) {
							String ctransfercarmrk = taxaobj.getString("c_transfer_car_mrk");
							if (StringUtils.isNotEmpty(ctransfercarmrk)) {
								sb.append("<C_TRANSFER_CAR_MRK>");
								sb.append(ctransfercarmrk);
								sb.append("</C_TRANSFER_CAR_MRK>");
							}
						}
						if (taxaobj.containsKey("c_citizenship")) {
							String ccitizenship = taxaobj.getString("c_citizenship");
							if (StringUtils.isNotEmpty(ccitizenship)) {
								sb.append("<C_CITIZENSHIP>");
								sb.append(ccitizenship);
								sb.append("</C_CITIZENSHIP>");
							}
						}
						if (taxaobj.containsKey("c_postal_code")) {
							String cpostalcode = taxaobj.getString("c_postal_code");
							if (StringUtils.isNotEmpty(cpostalcode)) {
								sb.append("<C_POSTAL_CODE>");
								sb.append(cpostalcode);
								sb.append("</C_POSTAL_CODE>");
							}
						}
						if (taxaobj.containsKey("c_tel")) {
							String ctel = taxaobj.getString("c_tel");
							if (StringUtils.isNotEmpty(ctel)) {
								sb.append("<C_TEL>");
								sb.append(ctel);
								sb.append("</C_TEL>");
							}
						}
						if (taxaobj.containsKey("n_cur_total_amount")) {
							String ncurtotalamount = taxaobj.getString("n_cur_total_amount");
							if (StringUtils.isNotEmpty(ncurtotalamount)) {
								sb.append("<N_CUR_TOTAL_AMOUNT>");
								sb.append(ncurtotalamount);
								sb.append("</N_CUR_TOTAL_AMOUNT>");
							}
						}
						if (taxaobj.containsKey("n_tax_due")) {
							String ntaxdue = taxaobj.getString("n_tax_due");
							if (StringUtils.isNotEmpty(ntaxdue)) {
								sb.append("<N_TAX_DUE>");
								sb.append(ntaxdue);
								sb.append("</N_TAX_DUE>");
							}
						}
						if (taxaobj.containsKey("c_tax_relief_cert_no")) {
							String ctaxreliefcertno = taxaobj.getString("c_tax_relief_cert_no");
							if (StringUtils.isNotEmpty(ctaxreliefcertno)) {
								sb.append("<C_TAX_RELIEF_CERT_NO>");
								sb.append(ctaxreliefcertno);
								sb.append("</C_TAX_RELIEF_CERT_NO>");
							}
						}
						if (taxaobj.containsKey("c_tax_country_cde")) {
							String ctaxcountrycde = taxaobj.getString("c_tax_country_cde");
							if (StringUtils.isNotEmpty(ctaxcountrycde)) {
								sb.append("<C_TAX_COUNTRY_CDE>");
								sb.append(ctaxcountrycde);
								sb.append("</C_TAX_COUNTRY_CDE>");
							}
						}
						if (taxaobj.containsKey("c_tax_use_type")) {
							String ctaxusetype = taxaobj.getString("c_tax_use_type");
							if (StringUtils.isNotEmpty(ctaxusetype)) {
								sb.append("<C_TAX_USE_TYPE>");
								sb.append(ctaxusetype);
								sb.append("</C_TAX_USE_TYPE>");
							}
						}
						sb.append("</TAXATION>");
					}
				}
			//*****************************************************************************************************
				if (bodyobj.containsKey("prm_coef_traffic_list") && "Y".equals(isprm_coef_traffic_list)) {
					JSONArray prmArry = bodyobj.getJSONArray("prm_coef_traffic_list");
					if(prmArry.isArray() && prmArry != null && prmArry.size() >0){

						sb.append("<PRM_COEF_TRAFFIC_LIST>");
						for(int z=0 ;z <prmArry.size() ;z++){
							JSONObject prmojb = (JSONObject) prmArry.get(z);
							sb.append("<PRM_COEF_TRAFFIC>");
							
							if (prmojb.containsKey("n_coef")) {
								String ncoef = prmojb.getString("n_coef");
								if (StringUtils.isNotEmpty(ncoef)) {
									sb.append("<N_COEF>");
									sb.append(ncoef);
									sb.append("</N_COEF>");
								}
							}
							
							if (prmojb.containsKey("c_discount_amount")) {
								String cdiscountamount = prmojb.getString("c_discount_amount");
								if (StringUtils.isNotEmpty(cdiscountamount)) {
									sb.append("<C_DISCOUNT_AMOUNT>");
									sb.append(cdiscountamount);
									sb.append("</C_DISCOUNT_AMOUNT>");
								}
							}
							
							if (prmojb.containsKey("c_accident_info")) {
								String caccidentinfo = prmojb.getString("c_accident_info");
								if (StringUtils.isNotEmpty(caccidentinfo)) {
									sb.append("<C_ACCIDENT_INFO>");
									sb.append(caccidentinfo);
									sb.append("</C_ACCIDENT_INFO>");
								}
							}
							
							if (prmojb.containsKey("c_danger_info")) {
								String c_danger_info = prmojb.getString("c_danger_info");
								if (StringUtils.isNotEmpty(c_danger_info)) {
									sb.append("<C_DANGER_INFO>");
									sb.append(c_danger_info);
									sb.append("</C_DANGER_INFO>");
								}
							}
							
							if (prmojb.containsKey("c_ndisc_rsn")) {
								String c_ndisc_rsn = prmojb.getString("c_ndisc_rsn");
								if (StringUtils.isNotEmpty(c_ndisc_rsn)) {
									sb.append("<C_NDISC_RSN>");
									sb.append(c_ndisc_rsn);
									sb.append("</C_NDISC_RSN>");
								}
							}
							
							if (prmojb.containsKey("c_safety_viola")) {
								String c_safety_viola = prmojb.getString("c_safety_viola");
								if (StringUtils.isNotEmpty(c_safety_viola)) {
									sb.append("<C_SAFETY_VIOLA>");
									sb.append(c_safety_viola);
									sb.append("</C_SAFETY_VIOLA>");
								}
							}
							
							if (prmojb.containsKey("n_record_rise_rat")) {
								String n_record_rise_rat = prmojb.getString("n_record_rise_rat");
								if (StringUtils.isNotEmpty(n_record_rise_rat)) {
									sb.append("<N_RECORD_RISE_RAT>");
									sb.append(n_record_rise_rat);
									sb.append("</N_RECORD_RISE_RAT>");
								}
							}
							
							if (prmojb.containsKey("n_ly_rep_rise_rat")) {
								String n_ly_rep_rise_rat = prmojb.getString("n_ly_rep_rise_rat");
								if (StringUtils.isNotEmpty(n_ly_rep_rise_rat)) {
									sb.append("<N_LY_REP_RISE_RAT>");
									sb.append(n_ly_rep_rise_rat);
									sb.append("</N_LY_REP_RISE_RAT>");
								}
							}
							
							if (prmojb.containsKey("n_drunk_dri")) {
								String n_drunk_dri = prmojb.getString("n_drunk_dri");
								if (StringUtils.isNotEmpty(n_drunk_dri)) {
									sb.append("<N_DRUNK_DRI>");
									sb.append(n_drunk_dri);
									sb.append("</N_DRUNK_DRI>");
								}
							}
							
							if (prmojb.containsKey("n_no_good")) {
								String n_no_good = prmojb.getString("n_no_good");
								if (StringUtils.isNotEmpty(n_no_good)) {
									sb.append("<N_NO_GOOD>");
									sb.append(n_no_good);
									sb.append("</N_NO_GOOD>");
								}
							}
							
							if (prmojb.containsKey("n_speed_num")) {
								String n_speed_num = prmojb.getString("n_speed_num");
								if (StringUtils.isNotEmpty(n_speed_num)) {
									sb.append("<N_SPEED_NUM>");
									sb.append(n_speed_num);
									sb.append("</N_SPEED_NUM>");
								}
							}
							
							if (prmojb.containsKey("n_break_rul")) {
								String n_break_rul = prmojb.getString("n_break_rul");
								if (StringUtils.isNotEmpty(n_break_rul)) {
									sb.append("<N_BREAK_RUL>");
									sb.append(n_break_rul);
									sb.append("</N_BREAK_RUL>");
								}
							}
							
							if (prmojb.containsKey("n_overload_num")) {
								String n_overload_num = prmojb.getString("n_overload_num");
								if (StringUtils.isNotEmpty(n_overload_num)) {
									sb.append("<N_OVERLOAD_NUM>");
									sb.append(n_overload_num);
									sb.append("</N_OVERLOAD_NUM>");
								}
							}
							
							if (prmojb.containsKey("n_other_num")) {
								String n_other_num = prmojb.getString("n_other_num");
								if (StringUtils.isNotEmpty(n_other_num)) {
									sb.append("<N_OTHER_NUM>");
									sb.append(n_other_num);
									sb.append("</N_OTHER_NUM>");
								}
							}
							
							if (prmojb.containsKey("n_death_toll")) {
								String n_death_toll = prmojb.getString("n_death_toll");
								if (StringUtils.isNotEmpty(n_death_toll)) {
									sb.append("<N_DEATH_TOLL>");
									sb.append(n_death_toll);
									sb.append("</N_DEATH_TOLL>");
								}
							}
							
							if (prmojb.containsKey("n_one_year_no_danger")) {
								String n_one_year_no_danger = prmojb.getString("n_one_year_no_danger");
								if (StringUtils.isNotEmpty(n_one_year_no_danger)) {
									sb.append("<N_ONE_YEAR_NO_DANGER>");
									sb.append(n_one_year_no_danger);
									sb.append("</N_ONE_YEAR_NO_DANGER>");
								}
							}
							
							if (prmojb.containsKey("n_peccancy_adjust_value")) {
								String n_peccancy_adjust_value = prmojb.getString("n_peccancy_adjust_value");
								if (StringUtils.isNotEmpty(n_peccancy_adjust_value)) {
									sb.append("<N_PECCANCY_ADJUST_VALUE>");
									sb.append(n_peccancy_adjust_value);
									sb.append("</N_PECCANCY_ADJUST_VALUE>");
								}
							}
							
							if (prmojb.containsKey("n_claim_adjust_value")) {
								String n_claim_adjust_value = prmojb.getString("n_claim_adjust_value");
								if (StringUtils.isNotEmpty(n_claim_adjust_value)) {
									sb.append("<N_CLAIM_ADJUST_VALUE>");
									sb.append(n_claim_adjust_value);
									sb.append("</N_CLAIM_ADJUST_VALUE>");
								}
							}
							
							if (prmojb.containsKey("n_driver_rate")) {
								String n_driver_rate = prmojb.getString("n_driver_rate");
								if (StringUtils.isNotEmpty(n_driver_rate)) {
									sb.append("<N_DRIVER_RATE>");
									sb.append(n_driver_rate);
									sb.append("</N_DRIVER_RATE>");
								}
							}
							
							if (prmojb.containsKey("n_district_rate")) {
								String n_district_rate = prmojb.getString("n_district_rate");
								if (StringUtils.isNotEmpty(n_district_rate)) {
									sb.append("<N_DISTRICT_RATE>");
									sb.append(n_district_rate);
									sb.append("</N_DISTRICT_RATE>");
								}
							}
							
							if (prmojb.containsKey("n_addition_rate")) {
								String n_addition_rate = prmojb.getString("n_addition_rate");
								if (StringUtils.isNotEmpty(n_addition_rate)) {
									sb.append("<N_ADDITION_RATE>");
									sb.append(n_addition_rate);
									sb.append("</N_ADDITION_RATE>");
								}
							}
							
							if (prmojb.containsKey("c_peccancy_adjust_reason")) {
								String c_peccancy_adjust_reason = prmojb.getString("c_peccancy_adjust_reason");
								if (StringUtils.isNotEmpty(c_peccancy_adjust_reason)) {
									sb.append("<C_PECCANCY_ADJUST_REASON>");
									sb.append(c_peccancy_adjust_reason);
									sb.append("</C_PECCANCY_ADJUST_REASON>");
								}
							}
							
							if (prmojb.containsKey("c_claim_adjust_reason")) {
								String c_claim_adjust_reason = prmojb.getString("c_claim_adjust_reason");
								if (StringUtils.isNotEmpty(c_claim_adjust_reason)) {
									sb.append("<C_CLAIM_ADJUST_REASON>");
									sb.append(c_claim_adjust_reason);
									sb.append("</C_CLAIM_ADJUST_REASON>");
								}
							}
							
							if (prmojb.containsKey("c_no_float_reason")) {
								String c_no_float_reason = prmojb.getString("c_no_float_reason");
								if (StringUtils.isNotEmpty(c_no_float_reason)) {
									sb.append("<C_NO_FLOAT_REASON>");
									sb.append(c_no_float_reason);
									sb.append("</C_NO_FLOAT_REASON>");
								}
							}
							
							if (prmojb.containsKey("n_claim_time")) {
								String n_claim_time = prmojb.getString("n_claim_time");
								if (StringUtils.isNotEmpty(n_claim_time)) {
									sb.append("<N_CLAIM_TIME>");
									sb.append(n_claim_time);
									sb.append("</N_CLAIM_TIME>");
								}
							}
							
							if (prmojb.containsKey("c_ndisc_rsn_code")) {
								String c_ndisc_rsn_code = prmojb.getString("c_ndisc_rsn_code");
								if (StringUtils.isNotEmpty(c_ndisc_rsn_code)) {
									sb.append("<C_NDISC_RSN_CODE>");
									sb.append(c_ndisc_rsn_code);
									sb.append("</C_NDISC_RSN_CODE>");
								}
							}
							
							
							
							sb.append("</PRM_COEF_TRAFFIC>");
						}
						sb.append("</PRM_COEF_TRAFFIC_LIST>");
					}
				}
				
				
				
				
	//*********************************************************************************************************			
				if (bodyobj.containsKey("prm_coef_business_list") && "Y".equals(isprm_coef_business_list)) {
					JSONArray pctArray = bodyobj.getJSONArray("prm_coef_business_list");
					if(pctArray.isArray() && pctArray != null && pctArray.size() >0){
						sb.append("<PRM_COEF_BUSINESS_list>");
						for(int z=0 ;z <pctArray.size() ;z++){
							JSONObject pctojb = (JSONObject) pctArray.get(z);
							sb.append("<PRM_COEF_BUSINESS>");
							if (pctojb.containsKey("c_is_fit")) {
								String cisfit = pctojb.getString("c_is_fit");
								if (StringUtils.isNotEmpty(cisfit)) {
									sb.append("<C_IS_FIT>");
									sb.append(cisfit);
									sb.append("</C_IS_FIT>");
								}
							}
							if (pctojb.containsKey("n_manual_product")) {
								String nmanualproduct = pctojb.getString("n_manual_product");
								if (StringUtils.isNotEmpty(nmanualproduct)) {
									sb.append("<N_MANUAL_PRODUCT>");
									sb.append(nmanualproduct);
									sb.append("</N_MANUAL_PRODUCT>");
								}
							}
							if (pctojb.containsKey("n_channel_factor")) {
								String nchannelfactor = pctojb.getString("n_channel_factor");
								if (StringUtils.isNotEmpty(nchannelfactor)) {
									sb.append("<N_CHANNEL_FACTOR>");
									sb.append(nchannelfactor);
									sb.append("</N_CHANNEL_FACTOR>");
								}
							}
							if (pctojb.containsKey("n_indept_under_factor")) {
								String nindeptunderfactor = pctojb.getString("n_indept_under_factor");
								if (StringUtils.isNotEmpty(nindeptunderfactor)) {
									sb.append("<N_INDEPT_UNDER_FACTOR>");
									sb.append(nindeptunderfactor);
									sb.append("</N_INDEPT_UNDER_FACTOR>");
								}
							}
							if (pctojb.containsKey("n_all_same_time")) {
								String nallsametime = pctojb.getString("n_all_same_time");
								if (StringUtils.isNotEmpty(nallsametime)) {
									sb.append("<N_ALL_SAME_TIME>");
									sb.append(nallsametime);
									sb.append("</N_ALL_SAME_TIME>");
								}
							}
							if (pctojb.containsKey("c_claim_adjust_reason")) {
								String cclaimadjustreason = pctojb.getString("c_claim_adjust_reason");
								if (StringUtils.isNotEmpty(cclaimadjustreason)) {
									sb.append("<C_CLAIM_ADJUST_REASON>");
									sb.append(cclaimadjustreason);
									sb.append("</C_CLAIM_ADJUST_REASON>");
								}
							}
							if (pctojb.containsKey("n_coef")) {
								String ncoef = pctojb.getString("n_coef");
								if (StringUtils.isNotEmpty(ncoef)) {
									sb.append("<N_COEF>");
									sb.append(ncoef);
									sb.append("</N_COEF>");
								}
							}
							if (pctojb.containsKey("c_no_claim_adjust_reason")) {
								String cnoclaimadjustreason = pctojb.getString("c_no_claim_adjust_reason");
								if (StringUtils.isNotEmpty(cnoclaimadjustreason)) {
									sb.append("<C_NO_CLAIM_ADJUST_REASON>");
									sb.append(cnoclaimadjustreason);
									sb.append("</C_NO_CLAIM_ADJUST_REASON>");
								}
							}
							if (pctojb.containsKey("n_claim_adjust_value")) {
								String nclaimadjustvalue = pctojb.getString("n_claim_adjust_value");
								if (StringUtils.isNotEmpty(nclaimadjustvalue)) {
									sb.append("<N_CLAIM_ADJUST_VALUE>");
									sb.append(nclaimadjustvalue);
									sb.append("</N_CLAIM_ADJUST_VALUE>");
								}
							}
							if (pctojb.containsKey("n_business_source_rat")) {
								String nbusinesssourcerat = pctojb.getString("n_business_source_rat");
								if (StringUtils.isNotEmpty(nbusinesssourcerat)) {
									sb.append("<N_BUSINESS_SOURCE_RAT>");
									sb.append(nbusinesssourcerat);
									sb.append("</N_BUSINESS_SOURCE_RAT>");
								}
							}
							if (pctojb.containsKey("n_vhlowner_gender_rat")) {
								String nvhlownergenderrat = pctojb.getString("n_vhlowner_gender_rat");
								if (StringUtils.isNotEmpty(nvhlownergenderrat)) {
									sb.append("<N_VHLOWNER_GENDER_RAT>");
									sb.append(nvhlownergenderrat);
									sb.append("</N_VHLOWNER_GENDER_RAT>");
								}
							}
							if (pctojb.containsKey("n_vhlowner_coty_rat")) {
								String nvhlownercotyrat = pctojb.getString("n_vhlowner_coty_rat");
								if (StringUtils.isNotEmpty(nvhlownercotyrat)) {
									sb.append("<N_VHLOWNER_COTY_RAT>");
									sb.append(nvhlownercotyrat);
									sb.append("</N_VHLOWNER_COTY_RAT>");
								}
							}
							if (pctojb.containsKey("n_vhlseries_rat")) {
								String nvhlseriesrat = pctojb.getString("n_vhlseries_rat");
								if (StringUtils.isNotEmpty(nvhlseriesrat)) {
									sb.append("<N_VHLSERIES_RAT>");
									sb.append(nvhlseriesrat);
									sb.append("</N_VHLSERIES_RAT>");
								}
							}
							if (pctojb.containsKey("n_his_cvrg_situ_rat")) {
								String nhiscvrgsiturat = pctojb.getString("n_his_cvrg_situ_rat");
								if (StringUtils.isNotEmpty(nhiscvrgsiturat)) {
									sb.append("<N_HIS_CVRG_SITU_RAT>");
									sb.append(nhiscvrgsiturat);
									sb.append("</N_HIS_CVRG_SITU_RAT>");
								}
							}
							if (pctojb.containsKey("n_loss_ratio_class_rat")) {
								String nlossratioclassrat = pctojb.getString("n_loss_ratio_class_rat");
								if (StringUtils.isNotEmpty(nlossratioclassrat)) {
									sb.append("<N_LOSS_RATIO_CLASS_RAT>");
									sb.append(nlossratioclassrat);
									sb.append("</N_LOSS_RATIO_CLASS_RAT>");
								}
							}
							if (pctojb.containsKey("n_truck_type_rat")) {
								String ntrucktyperat = pctojb.getString("n_truck_type_rat");
								if (StringUtils.isNotEmpty(ntrucktyperat)) {
									sb.append("<N_TRUCK_TYPE_RAT>");
									sb.append(ntrucktyperat);
									sb.append("</N_TRUCK_TYPE_RAT>");
								}
							}
							if (pctojb.containsKey("n_truck_tonnage_rat")) {
								String ntrucktonnagerat = pctojb.getString("n_truck_tonnage_rat");
								if (StringUtils.isNotEmpty(ntrucktonnagerat)) {
									sb.append("<N_TRUCK_TONNAGE_RAT>");
									sb.append(ntrucktonnagerat);
									sb.append("</N_TRUCK_TONNAGE_RAT>");
								}
							}
							if (pctojb.containsKey("n_spe_vhl_type_rat")) {
								String nspevhltyperat = pctojb.getString("n_spe_vhl_type_rat");
								if (StringUtils.isNotEmpty(nspevhltyperat)) {
									sb.append("<N_SPE_VHL_TYPE_RAT>");
									sb.append(nspevhltyperat);
									sb.append("</N_SPE_VHL_TYPE_RAT>");
								}
							}
							if (pctojb.containsKey("n_traffic_violate_rat")) {
								String ntrafficviolaterat = pctojb.getString("n_traffic_violate_rat");
								if (StringUtils.isNotEmpty(ntrafficviolaterat)) {
									sb.append("<N_TRAFFIC_VIOLATE_RAT>");
									sb.append(ntrafficviolaterat);
									sb.append("</N_TRAFFIC_VIOLATE_RAT>");
								}
							}
							if (pctojb.containsKey("n_dpt_auto_under_rat")) {
								String ndptautounderrat = pctojb.getString("n_dpt_auto_under_rat");
								if (StringUtils.isNotEmpty(ndptautounderrat)) {
									sb.append("<N_DPT_AUTO_UNDER_RAT>");
									sb.append(ndptautounderrat);
									sb.append("</N_DPT_AUTO_UNDER_RAT>");
								}
							}
							if (pctojb.containsKey("n_under_channel_rat_product")) {
								String nunderchannelratproduct = pctojb.getString("n_under_channel_rat_product");
								if (StringUtils.isNotEmpty(nunderchannelratproduct)) {
									sb.append("<N_UNDER_CHANNEL_RAT_PRODUCT>");
									sb.append(nunderchannelratproduct);
									sb.append("</N_UNDER_CHANNEL_RAT_PRODUCT>");
								}
							}
							sb.append("</PRM_COEF_BUSINESS>");
						}
						sb.append("</PRM_COEF_BUSINESS_list>");
					}
				}
		//****************************************************************************************************		
				if (bodyobj.containsKey("sale_list") && "Y".equals(issale_list)) {
					JSONArray salArray = bodyobj.getJSONArray("sale_list");
					if(salArray.isArray() && salArray != null && salArray.size() >0){

						sb.append("<SALE_LIST>");
						for(int d=0 ;d <salArray.size() ;d++){
							JSONObject salojb = (JSONObject) salArray.get(d);
							sb.append("<SALE_DATA>");
							if (salojb.containsKey("n_seq_no")) {
								String nseqno = salojb.getString("n_seq_no");
								if (StringUtils.isNotEmpty(nseqno)) {
									sb.append("<N_SEQ_NO>");
									sb.append(nseqno);
									sb.append("</N_SEQ_NO>");
								}
							}
							if (salojb.containsKey("c_emp_typ")) {
								String cemptyp = salojb.getString("c_emp_typ");
								if (StringUtils.isNotEmpty(cemptyp)) {
									sb.append("<C_EMP_TYP>");
									sb.append(cemptyp);
									sb.append("</C_EMP_TYP>");
								}
							}
							if (salojb.containsKey("c_emp_cde")) {
								String cempcde = salojb.getString("c_emp_cde");
								if (StringUtils.isNotEmpty(cempcde)) {
									sb.append("<C_EMP_CDE>");
									sb.append(cempcde);
									sb.append("</C_EMP_CDE>");
								}
							}
							if (salojb.containsKey("c_sale_name")) {
								String csalename = salojb.getString("c_sale_name");
								if (StringUtils.isNotEmpty(csalename)) {
									sb.append("<C_SALE_NAME>");
									sb.append(csalename);
									sb.append("</C_SALE_NAME>");
								}
							}
							if (salojb.containsKey("c_job_no")) {
								String cjobno = salojb.getString("c_job_no");
								if (StringUtils.isNotEmpty(cjobno)) {
									sb.append("<C_JOB_NO>");
									sb.append(cjobno);
									sb.append("</C_JOB_NO>");
								}
							}
							if (salojb.containsKey("c_behavior")) {
								String cbehavior = salojb.getString("c_behavior");
								if (StringUtils.isNotEmpty(cbehavior)) {
									sb.append("<C_BEHAVIOR>");
									sb.append(cbehavior);
									sb.append("</C_BEHAVIOR>");
								}
							}
							sb.append("</SALE_DATA>");
						}
						sb.append("</SALE_LIST>");
					}
				}
				
				if(bodyobj.containsKey("c_unfix_spc_data")){
					JSONObject csdobj = bodyobj.getJSONObject("c_unfix_spc_data");
					if(!csdobj.isNullObject() && "Y".equals(isc_unfix_spc_data)){
						sb.append("<C_UNFIX_SPC_DATA>");
						if (csdobj.containsKey("c_dpt_cde")) {
							String c_dpt_cde = csdobj.getString("c_dpt_cde");
							if (StringUtils.isNotEmpty(c_dpt_cde)) {
								sb.append("<C_DPT_CDE>");
								sb.append(c_dpt_cde);
								sb.append("</C_DPT_CDE>");
							}
						}
						if (csdobj.containsKey("c_prod_no")) {
							String c_prod_no = csdobj.getString("c_prod_no");
							if (StringUtils.isNotEmpty(c_prod_no)) {
								sb.append("<C_PROD_NO>");
								sb.append(c_prod_no);
								sb.append("</C_PROD_NO>");
							}
						}
						if (csdobj.containsKey("c_code")) {
							String c_code = csdobj.getString("c_code");
							if (StringUtils.isNotEmpty(c_code)) {
								sb.append("<C_CODE>");
								sb.append(c_code);
								sb.append("</C_CODE>");
							}
						}
						sb.append("</C_UNFIX_SPC_DATA>");
					}
				}
				
				
				if (bodyobj.containsKey("chit_data")) {
					JSONObject taaobj = bodyobj.getJSONObject("chit_data");
					if (!taaobj.isNullObject() && "Y".equals(ischit_data)) {

						sb.append("<CHIT_DATA>");
						if (taaobj.containsKey("c_third_cde")) {
							String cthirdcde = taaobj.getString("c_third_cde");
							if (StringUtils.isNotEmpty(cthirdcde)) {
								sb.append("<C_THIRD_CDE>");
								sb.append(cthirdcde);
								sb.append("</C_THIRD_CDE>");
							}
						}
						if (taaobj.containsKey("c_is_invoice")) {
							String cisinvoice = taaobj.getString("c_is_invoice");
							if (StringUtils.isNotEmpty(cisinvoice)) {
								sb.append("<C_IS_INVOICE>");
								sb.append(cisinvoice);
								sb.append("</C_IS_INVOICE>");
							}
						}
						if (taaobj.containsKey("c_is_chit_mrk")) {
							String cischitmrk = taaobj.getString("c_is_chit_mrk");
							if (StringUtils.isNotEmpty(cischitmrk)) {
								sb.append("<C_IS_CHIT_MRK>");
								sb.append(cischitmrk);
								sb.append("</C_IS_CHIT_MRK>");
							}
						}
						if (taaobj.containsKey("c_dpt_cde")) {
							String cdptcde = taaobj.getString("c_dpt_cde");
							if (StringUtils.isNotEmpty(cdptcde)) {
								sb.append("<C_DPT_CDE>");
								sb.append(cdptcde);
								sb.append("</C_DPT_CDE>");
							}
						}
						if (taaobj.containsKey("c_inv_nme")) {
							String cinvnme = taaobj.getString("c_inv_nme");
							if (StringUtils.isNotEmpty(cinvnme)) {
								sb.append("<C_INV_NME>");
								sb.append(cinvnme);
								sb.append("</C_INV_NME>");
							}
						}
						if (taaobj.containsKey("c_iov_nme")) {
							String ciovnme = taaobj.getString("c_iov_nme");
							if (StringUtils.isNotEmpty(ciovnme)) {
								sb.append("<C_IOV_NME>");
								sb.append(ciovnme);
								sb.append("</C_IOV_NME>");
							}
						}
						if (taaobj.containsKey("c_pep_type")) {
							String cpeptype = taaobj.getString("c_pep_type");
							if (StringUtils.isNotEmpty(cpeptype)) {
								sb.append("<C_PEP_TYPE>");
								sb.append(cpeptype);
								sb.append("</C_PEP_TYPE>");
							}
						}
						if (taaobj.containsKey("c_pep_cde")) {
							String cpepcde = taaobj.getString("c_pep_cde");
							if (StringUtils.isNotEmpty(cpepcde)) {
								sb.append("<C_PEP_CDE>");
								sb.append(cpepcde);
								sb.append("</C_PEP_CDE>");
							}
						}
						if (taaobj.containsKey("c_fig_sta")) {
							String cfigsta = taaobj.getString("c_fig_sta");
							if (StringUtils.isNotEmpty(cfigsta)) {
								sb.append("<C_FIG_STA>");
								sb.append(cfigsta);
								sb.append("</C_FIG_STA>");
							}
						}
						if (taaobj.containsKey("c_iov_type")) {
							String ciovtype = taaobj.getString("c_iov_type");
							if (StringUtils.isNotEmpty(ciovtype)) {
								sb.append("<C_IOV_TYPE>");
								sb.append(ciovtype);
								sb.append("</C_IOV_TYPE>");
							}
						}
						if (taaobj.containsKey("c_ioe_type")) {
							String cioetype = taaobj.getString("c_ioe_type");
							if (StringUtils.isNotEmpty(cioetype)) {
								sb.append("<C_IOE_TYPE>");
								sb.append(cioetype);
								sb.append("</C_IOE_TYPE>");
							}
						}
						if (taaobj.containsKey("c_inv_mum")) {
							String cinvmum = taaobj.getString("c_inv_mum");
							if (StringUtils.isNotEmpty(cinvmum)) {
								sb.append("<C_INV_MUM>");
								sb.append(cinvmum);
								sb.append("</C_INV_MUM>");
							}
						}
						if (taaobj.containsKey("c_gop_list")) {
							String cgoplist = taaobj.getString("c_gop_list");
							if (StringUtils.isNotEmpty(cgoplist)) {
								sb.append("<C_GOP_LIST>");
								sb.append(cgoplist);
								sb.append("</C_GOP_LIST>");
							}
						}
						if (taaobj.containsKey("c_prd_nme")) {
							String cprdnme = taaobj.getString("c_prd_nme");
							if (StringUtils.isNotEmpty(cprdnme)) {
								sb.append("<C_PRD_NME>");
								sb.append(cprdnme);
								sb.append("</C_PRD_NME>");
							}
						}
						if (taaobj.containsKey("c_buy_nme")) {
							String cbuynme = taaobj.getString("c_buy_nme");
							if (StringUtils.isNotEmpty(cbuynme)) {
								sb.append("<C_BUY_NME>");
								sb.append(cbuynme);
								sb.append("</C_BUY_NME>");
							}
						}
						if (taaobj.containsKey("n_all_pie")) {
							String nallpie = taaobj.getString("n_all_pie");
							if (StringUtils.isNotEmpty(nallpie)) {
								sb.append("<N_ALL_PIE>");
								sb.append(nallpie);
								sb.append("</N_ALL_PIE>");
							}
						}
						if (taaobj.containsKey("n_toa_pie")) {
							String ntoapie = taaobj.getString("n_toa_pie");
							if (StringUtils.isNotEmpty(ntoapie)) {
								sb.append("<N_TOA_PIE>");
								sb.append(ntoapie);
								sb.append("</N_TOA_PIE>");
							}
						}
						if (taaobj.containsKey("n_tac_tax")) {
							String ntactax = taaobj.getString("n_tac_tax");
							if (StringUtils.isNotEmpty(ntactax)) {
								sb.append("<N_TAC_TAX>");
								sb.append(ntactax);
								sb.append("</N_TAC_TAX>");
							}
						}
						if (taaobj.containsKey("n_inv_mot")) {
							String ninvmot = taaobj.getString("n_inv_mot");
							if (StringUtils.isNotEmpty(ninvmot)) {
								sb.append("<N_INV_MOT>");
								sb.append(ninvmot);
								sb.append("</N_INV_MOT>");
							}
						}
						if (taaobj.containsKey("n_bule_pic")) {
							String nbulepic = taaobj.getString("n_bule_pic");
							if (StringUtils.isNotEmpty(nbulepic)) {
								sb.append("<N_BULE_PIC>");
								sb.append(nbulepic);
								sb.append("</N_BULE_PIC>");
							}
						}
						if (taaobj.containsKey("n_red_pic")) {
							String nredpic = taaobj.getString("n_red_pic");
							if (StringUtils.isNotEmpty(nredpic)) {
								sb.append("<N_RED_PIC>");
								sb.append(nredpic);
								sb.append("</N_RED_PIC>");
							}
						}
						if (taaobj.containsKey("n_cbule_pic")) {
							String ncbulepic = taaobj.getString("n_cbule_pic");
							if (StringUtils.isNotEmpty(ncbulepic)) {
								sb.append("<N_CBULE_PIC>");
								sb.append(ncbulepic);
								sb.append("</N_CBULE_PIC>");
							}
						}
						if (taaobj.containsKey("n_cred_pic")) {
							String ncredpic = taaobj.getString("n_cred_pic");
							if (StringUtils.isNotEmpty(ncredpic)) {
								sb.append("<N_CRED_PIC>");
								sb.append(ncredpic);
								sb.append("</N_CRED_PIC>");
							}
						}
						if (taaobj.containsKey("c_rem_clm")) {
							String cremclm = taaobj.getString("c_rem_clm");
							if (StringUtils.isNotEmpty(cremclm)) {
								sb.append("<C_REM_CLM>");
								sb.append(cremclm);
								sb.append("</C_REM_CLM>");
							}
						}
						if (taaobj.containsKey("c_app_phone")) {
							String cappphone = taaobj.getString("c_app_phone");
							if (StringUtils.isNotEmpty(cappphone)) {
								sb.append("<C_APP_PHONE>");
								sb.append(cappphone);
								sb.append("</C_APP_PHONE>");
							}
						}
						if (taaobj.containsKey("c_app_email")) {
							String cappemail = taaobj.getString("c_app_email");
							if (StringUtils.isNotEmpty(cappemail)) {
								sb.append("<C_APP_EMAIL>");
								sb.append(cappemail);
								sb.append("</C_APP_EMAIL>");
							}
						}
						if (taaobj.containsKey("c_app_name")) {
							String cappname = taaobj.getString("c_app_name");
							if (StringUtils.isNotEmpty(cappname)) {
								sb.append("<C_APP_NAME>");
								sb.append(cappname);
								sb.append("</C_APP_NAME>");
							}
						}
						sb.append("</CHIT_DATA>");
					}
				}
					sb.append("</BODY>");
			}
		}
		sb.append("</PACKET>");
		resMap.put("reqXml", sb.toString());
		resMap.put("transtype", transtype);
		return resMap;
	}
	
	private static void fittingCvrgList(JSONObject bodyobj,String cvrglistflag,String transtype ,StringBuffer sb,boolean isTpf){
		if (bodyobj.containsKey(cvrglistflag)) {
			JSONObject jsojbtemp = bodyobj.getJSONObject(cvrglistflag);
			Set keys = jsojbtemp.keySet();
			
			if(keys != null && keys.size()>0){
				sb.append("<CVRG_LIST>");
				Object[] ks = keys.toArray();
				for(int i=0 ;i<ks.length;i++){
					JSONObject jsojb = jsojbtemp.getJSONObject(ks[i].toString());

					
					if("V7203".equals(transtype) || "V7620".equals(transtype)){
						sb.append("<CVRG_DATA>");
					}else{
						sb.append("<CVRG_INFO>");
					}
					if (jsojb.containsKey("n_seq_no")) {
						String nseqno = jsojb.getString("n_seq_no");
						if (StringUtils.isNotEmpty(nseqno)) {
							sb.append("<N_SEQ_NO>");
							sb.append(nseqno);
							sb.append("</N_SEQ_NO>");
						}
					}
					if (jsojb.containsKey("c_cvrg_no")) {
						String ccvrgno = jsojb.getString("c_cvrg_no");
						if (StringUtils.isNotEmpty(ccvrgno)) {
							sb.append("<C_CVRG_NO>");
							sb.append(ccvrgno);
							sb.append("</C_CVRG_NO>");
						}
					}
					if (jsojb.containsKey("n_amt")) {
						String namt = jsojb.getString("n_amt");
						if (StringUtils.isNotEmpty(namt)) {
							sb.append("<N_AMT>");
							sb.append(namt);
							sb.append("</N_AMT>");
						}else{
							if(isTpf){
								sb.append("<N_AMT>");
								sb.append("122000");
								sb.append("</N_AMT>");
							}
						}
					}
					if (jsojb.containsKey("n_amt_per")) {
						String n_amt_per = jsojb.getString("n_amt_per");
						if (StringUtils.isNotEmpty(n_amt_per)) {
							sb.append("<N_AMT_PER>");
							sb.append(n_amt_per);
							sb.append("</N_AMT_PER>");
						}
					}
					if (jsojb.containsKey("n_liab_days_lmt")) {
						String n_liab_days_lmt = jsojb.getString("n_liab_days_lmt");
						if (StringUtils.isNotEmpty(n_liab_days_lmt)) {
							sb.append("<N_LIAB_DAYS_LMT>");
							sb.append(n_liab_days_lmt);
							sb.append("</N_LIAB_DAYS_LMT>");
						}
					}
					if (jsojb.containsKey("t_insrnc_bgn_tm")) {
						String t_insrnc_bgn_tm = jsojb.getString("t_insrnc_bgn_tm");
						if (StringUtils.isNotEmpty(t_insrnc_bgn_tm)) {
							sb.append("<T_INSRNC_BGN_TM>");
							sb.append(t_insrnc_bgn_tm);
							sb.append("</T_INSRNC_BGN_TM>");
						}
					}
					if (jsojb.containsKey("t_insrnc_end_tm")) {
						String t_insrnc_end_tm = jsojb.getString("t_insrnc_end_tm");
						if (StringUtils.isNotEmpty(t_insrnc_end_tm)) {
							sb.append("<T_INSRNC_END_TM>");
							sb.append(t_insrnc_end_tm);
							sb.append("</T_INSRNC_END_TM>");
						}
					}
					if (jsojb.containsKey("c_glass_type")) {
						String cglasstype = jsojb.getString("c_glass_type");
						if (StringUtils.isNotEmpty(cglasstype)) {
							sb.append("<C_GLASS_TYPE>");
							sb.append(cglasstype);
							sb.append("</C_GLASS_TYPE>");
						}
					}
					if (jsojb.containsKey("n_compen_lim_day")) {
						String n_compen_lim_day = jsojb.getString("n_compen_lim_day");
						if (StringUtils.isNotEmpty(n_compen_lim_day)) {
							sb.append("<N_COMPEN_LIM_DAY>");
							sb.append(n_compen_lim_day);
							sb.append("</N_COMPEN_LIM_DAY>");
						}
					}
					if (jsojb.containsKey("n_compen_day_amt")) {
						String n_compen_day_amt = jsojb.getString("n_compen_day_amt");
						if (StringUtils.isNotEmpty(n_compen_day_amt)) {
							sb.append("<N_COMPEN_DAY_AMT>");
							sb.append(n_compen_day_amt);
							sb.append("</N_COMPEN_DAY_AMT>");
						}
					}
					if (jsojb.containsKey("c_specglass_mrk")) {
						String c_specglass_mrk = jsojb.getString("c_specglass_mrk");
						if (StringUtils.isNotEmpty(c_specglass_mrk)) {
							sb.append("<C_SPECGLASS_MRK>");
							sb.append(c_specglass_mrk);
							sb.append("</C_SPECGLASS_MRK>");
						}
					}
					if (jsojb.containsKey("n_rate")) {
						String nrate = jsojb.getString("n_rate");
						if (StringUtils.isNotEmpty(nrate)) {
							sb.append("<N_RATE>");
							sb.append(nrate);
							sb.append("</N_RATE>");
						}
					}
					if (jsojb.containsKey("n_deductible")) {
						String ndeductible = jsojb.getString("n_deductible");
						if (StringUtils.isNotEmpty(ndeductible)) {
							sb.append("<N_DEDUCTIBLE>");
							sb.append(ndeductible);
							sb.append("</N_DEDUCTIBLE>");
						}
					}
					if("V7204".equals(transtype)){
						if (jsojb.containsKey("c_per_amt")) {
							String cperamt = jsojb.getString("c_per_amt");
							if (StringUtils.isNotEmpty(cperamt)) {
								sb.append("<C_PER_AMT>");
								sb.append(cperamt);
								sb.append("</C_PER_AMT>");
								}
							}
							if (jsojb.containsKey("n_dduct_rate")) {
								String ndductrate = jsojb.getString("n_dduct_rate");
								if (StringUtils.isNotEmpty(ndductrate)) {
									sb.append("<N_DDUCT_RATE>");
									sb.append(ndductrate);
									sb.append("</N_DDUCT_RATE>");
								}
							}
							
							if (jsojb.containsKey("n_base_prm")) {
								String nbaseprm = jsojb.getString("n_base_prm");
								if (StringUtils.isNotEmpty(nbaseprm)) {
									sb.append("<N_BASE_PRM>");
									sb.append(nbaseprm);
									sb.append("</N_BASE_PRM>");
								}
							}
							if (jsojb.containsKey("n_bef_ann_prm")) {
								String nbefannprm = jsojb.getString("n_bef_ann_prm");
								if (StringUtils.isNotEmpty(nbefannprm)) {
									sb.append("<N_BEF_ANN_PRM>");
									sb.append(nbefannprm);
									sb.append("</N_BEF_ANN_PRM>");
								}
							}
							if (jsojb.containsKey("n_prm")) {
								String nprm = jsojb.getString("n_prm");
								if (StringUtils.isNotEmpty(nprm)) {
									sb.append("<N_PRM>");
									sb.append(nprm);
									sb.append("</N_PRM>");
								}
							}
							
							if (jsojb.containsKey("n_addt_cost_rate")) {
								String naddtcostrate = jsojb.getString("n_addt_cost_rate");
								if (StringUtils.isNotEmpty(naddtcostrate)) {
									sb.append("<N_ADDT_COST_RATE>");
									sb.append(naddtcostrate);
									sb.append("</N_ADDT_COST_RATE>");
								}
							}
							if (jsojb.containsKey("c_dduct_mrk")) {
								String c_dduct_mrk = jsojb.getString("c_dduct_mrk");
								if (StringUtils.isNotEmpty(c_dduct_mrk)) {
									sb.append("<C_DDUCT_MRK>");
									sb.append(c_dduct_mrk);
									sb.append("</C_DDUCT_MRK>");
								}
							}
							if (jsojb.containsKey("c_cost_rate")) {
								String c_cost_rate = jsojb.getString("c_cost_rate");
								if (StringUtils.isNotEmpty(c_cost_rate)) {
									sb.append("<C_COST_RATE>");
									sb.append(c_cost_rate);
									sb.append("</C_COST_RATE>");
								}
							}
							if (jsojb.containsKey("c_cost_ratio")) {
								String c_cost_ratio = jsojb.getString("c_cost_ratio");
								if (StringUtils.isNotEmpty(c_cost_ratio)) {
									sb.append("<C_COST_RATIO>");
									sb.append(c_cost_ratio);
									sb.append("</C_COST_RATIO>");
								}
							}
							if (jsojb.containsKey("n_cost_ratio_level")) {
								String n_cost_ratio_level = jsojb.getString("n_cost_ratio_level");
								if (StringUtils.isNotEmpty(n_cost_ratio_level)) {
									sb.append("<N_COST_RATIO_LEVEL>");
									sb.append(n_cost_ratio_level);
									sb.append("</N_COST_RATIO_LEVEL>");
								}
							}
							if (jsojb.containsKey("n_pure_risk_premium")) {
								String n_pure_risk_premium = jsojb.getString("n_pure_risk_premium");
								if (StringUtils.isNotEmpty(n_pure_risk_premium)) {
									sb.append("<N_PURE_RISK_PREMIUM>");
									sb.append(n_pure_risk_premium);
									sb.append("</N_PURE_RISK_PREMIUM>");
								}
							}
							if (jsojb.containsKey("n_non_deduct_pure_risk_prm")) {
								String n_non_deduct_pure_risk_prm = jsojb.getString("n_non_deduct_pure_risk_prm");
								if (StringUtils.isNotEmpty(n_non_deduct_pure_risk_prm)) {
									sb.append("<N_NON_DEDUCT_PURE_RISK_PRM>");
									sb.append(n_non_deduct_pure_risk_prm);
									sb.append("</N_NON_DEDUCT_PURE_RISK_PRM>");
								}
							}
							if (jsojb.containsKey("n_deductible_discount")) {
								String n_deductible_discount = jsojb.getString("n_deductible_discount");
								if (StringUtils.isNotEmpty(n_deductible_discount)) {
									sb.append("<N_DEDUCTIBLE_DISCOUNT>");
									sb.append(n_deductible_discount);
									sb.append("</N_DEDUCTIBLE_DISCOUNT>");
								}
							}
							
							
							if (jsojb.containsKey("n_liab_days_lmtt")) {
								String nliabdayslmtt = jsojb.getString("n_liab_days_lmtt");
								if (StringUtils.isNotEmpty(nliabdayslmtt)) {
									sb.append("<N_LIAB_DAYS_LMTT>");
									sb.append(nliabdayslmtt);
									sb.append("</N_LIAB_DAYS_LMTT>");
								}
							}
					}	
						
					if("V7203".equals(transtype) || "V7620".equals(transtype)){
						sb.append("</CVRG_DATA>");
					}else{
						sb.append("</CVRG_INFO>");
					}
				
				}
				sb.append("</CVRG_LIST>");
			}
		}
	}
	
	
	 /**
     * 
     * <p>
     * 
     * @description 如果class1或者class2为null，不做处理直接返回 .转换javabean ,将class2中的属性值赋值给class1，如果class1属性有值，则不覆盖
     *              ，前提条件是class1和class2都有同名属性
     *              </p>
     * @param class1
     *            基准类,被赋值对象
     * @param class2
     *            提供数据的对象
     * @throws Exception
     * @author ex_dingyongbiao
     * @see
     */
    public static void converJavaBean(Object class1, Object class2) {
        try {
            if(null == class1 || null == class2)
                return ;
            Class<?> clazz1 = class1.getClass();
            Class<?> clazz2 = class2.getClass();
            // 得到method方法
            Method[] method1 = clazz1.getMethods();
            Method[] method2 = clazz2.getMethods();

            int length1 = method1.length;
            int length2 = method2.length;
            if (length1 != 0 && length2 != 0) {
                // 创建一个get方法数组，专门存放class2的get方法。
                Method[] get = new Method[length2];
                for (int i = 0, j = 0; i < length2; i++) {
                    if (method2[i].getName().indexOf("get") == 0) {
                        get[j] = method2[i];
                        ++j;
                    }
                }

                for (int i = 0; i < get.length; i++) {
                    if (get[i] == null)// 数组初始化的长度多于get方法，所以数组后面的部分是null
                        continue;
                    // 得到get方法的值，判断时候为null，如果为null则进行下一个循环
                    Object value = get[i].invoke(class2, new Object[] {});
                    if (null == value)
                        continue;
                    if (value instanceof String && !StringUtils.isNotEmpty((String)value))
                        continue;
                    // 得到get方法的名称 例如：getXxxx
                    String getName = get[i].getName();
                    // 得到set方法的时候传入的参数类型，就是get方法的返回类型
                    Class<?> paramType = get[i].getReturnType();
                    
                    Method getMethod = null;
                    try {
                        // 判断在class1中时候有class2中的get方法，如果没有则抛异常继续循环
                        getMethod = clazz1.getMethod(getName, new Class[] {});
                    } catch (NoSuchMethodException e) {
                        continue;
                    }
                    // class1的get方法不为空并且class1中get方法得到的值为空，进行赋值，如果class1属性原来有值，则跳过
                    if(null == getMethod)
                    	continue;
                    //如果该属性是class类型，递归调用该方法
//                    if(paramType instanceof Class)
//                    	converJavaBean(getMethod.invoke(class1, new Object[] {}),getMethod.invoke(class2, new Object[] {}));
                    //不为空并不是字符串类型
                    if(null != getMethod.invoke(class1, new Object[] {})&&
                    		!(getMethod.invoke(class1, new Object[] {}) instanceof String))
                    	continue;
                    //如果是空字符串也进行赋值
                    if (null != getMethod.invoke(class1, new Object[] {})
                    		&& (getMethod.invoke(class1, new Object[] {}) instanceof String && StringUtils.isNotEmpty((String)getMethod.invoke(class1, new Object[] {}))
                    		))
                        continue;
                    
                    // 通过getName 例如getXxxx 截取后得到Xxxx，然后在前面加上set，就组装成set的方法名
                    String setName = "set" + getName.substring(3);
                    // 得到class1的set方法，并调用
                    Method setMethod = clazz1.getMethod(setName, paramType);
                    setMethod.invoke(class1, value);
                }
            }
        } catch(Exception e) {
        	System.out.println(e);
        }
    }

	public static String toXmlbyDto(JSONObject jsonparam,String teqType,String code,String c_prod_no){
		StringBuffer sb = new StringBuffer("");
		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sb.append("<PACKET type=\"REQUEST\" version=\"1.0\">");
		if (!jsonparam.isNullObject() && jsonparam.containsKey("head")) {
			JSONObject headobj = jsonparam.getJSONObject("head");
			if (!headobj.isNullObject()) {
				sb.append("<HEAD>");
				sb.append("<TRANS_TYPE>");
				sb.append(teqType);
				sb.append("</TRANS_TYPE>");
				if (headobj.containsKey("user")) {
					String user = headobj.getString("user");
					if (StringUtils.isNotEmpty(user)) {
						sb.append("<USER>");
						sb.append(user);
						sb.append("</USER>");
					}
				}
				if (headobj.containsKey("password")) {
					String password = headobj.getString("password");
					if (StringUtils.isNotEmpty(password)) {
						sb.append("<PASSWORD>");
						sb.append(password);
						sb.append("</PASSWORD>");
					}
				}
				
				String serialno = teqType + System.currentTimeMillis();
				if (StringUtils.isNotEmpty(serialno)) {
					sb.append("<SERIALDECIMAL>");
					sb.append(serialno);
					sb.append("</SERIALDECIMAL>");
				}
				sb.append("</HEAD>");
			}
		}
		
		sb.append("<BODY>");
		sb.append("<C_UNFIX_SPC_DATA>");
		JSONObject bodyobj = jsonparam.getJSONObject("body");
		sb.append("<C_DPT_CDE>");
		String c_dpt_cde = (String) bodyobj.getJSONObject("base_part").get("c_dpt_cde");
		String dcde = "31";
		if(StringUtils.isNotEmpty(c_dpt_cde)){
			dcde = c_dpt_cde.substring(0, 2);
		}
		sb.append(dcde);
		sb.append("</C_DPT_CDE>");
		
		sb.append("<C_PROD_NO>");
		sb.append(c_prod_no);
		sb.append("</C_PROD_NO>");
		
		sb.append("<C_CODE>");
		sb.append(code);
		sb.append("</C_CODE>");
		
		sb.append("</C_UNFIX_SPC_DATA>");
		sb.append("</BODY>");
		sb.append("</PACKET>");
		return sb.toString();
	}
	public static Map getXmlToC108(JSONObject requestObject,String c_ref_code2){
		Map resMap = new HashMap();
		StringBuffer sb = new StringBuffer("");
		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
		sb.append("<PACKET type=\"REQUEST\" version=\"1.0\">");
		String transtype = StringUtils.EMPTY;
		if (!requestObject.isNullObject() && requestObject.containsKey("head")) {
			JSONObject headobj = requestObject.getJSONObject("head");
			if (!headobj.isNullObject()) {
				sb.append("<HEAD>");
				String trans_type = StringUtils.EMPTY;
				if (headobj.containsKey("trans_type")) {
					trans_type = "B104";
					if (StringUtils.isNotEmpty(trans_type)) {
						sb.append("<TRANS_TYPE>");
						sb.append(trans_type);
						sb.append("</TRANS_TYPE>");
					}
					transtype = trans_type;
				}
				
				String user = StringUtils.EMPTY;
				String password = StringUtils.EMPTY;
				
				//合作伙伴接口交易类型---B
				user = requestObject.getString("user_b");
				password = requestObject.getString("password_b");
				
				if (headobj.containsKey("user")) {
//					String user = headobj.getString("user");
					if (StringUtils.isNotEmpty(user)) {
						sb.append("<USER>");
						sb.append(user);
						sb.append("</USER>");
					}
					resMap.put("user", user);
				}
				if (headobj.containsKey("password")) {
//					String password = headobj.getString("password");
					if (StringUtils.isNotEmpty(password)) {
						sb.append("<PASSWORD>");
						sb.append(password);
						sb.append("</PASSWORD>");
					}
					resMap.put("password", password);
				}
				String serialdecimal = trans_type + System.currentTimeMillis();
				if (StringUtils.isNotEmpty(serialdecimal)) {
					sb.append("<SERIALNO>");
					sb.append(serialdecimal);
					sb.append("</SERIALNO>");
				}
				sb.append("</HEAD>");
			}
		}
		if (!requestObject.isNullObject() && requestObject.containsKey("body")) {
			sb.append("<BODY>");
			JSONObject bodyobj = requestObject.getJSONObject("body");
			if(bodyobj.containsKey("base_part")){
				sb.append("<BASE_PART>");
				JSONObject bpobj = bodyobj.getJSONObject("base_part");
				if (bpobj.containsKey("c_dpt_cde")) {
					String c_dpt_cde = bpobj.getString("c_dpt_cde");
					if (StringUtils.isNotEmpty(c_dpt_cde)) {
						sb.append("<C_DPT_CDE>");
						sb.append(c_dpt_cde);
						sb.append("</C_DPT_CDE>");
					}
				}
				if (bpobj.containsKey("c_prod_no")) {
					String c_prod_no = bpobj.getString("c_prod_no");
					if (StringUtils.isNotEmpty(c_prod_no)) {
						sb.append("<C_PROD_NO>");
						sb.append(c_prod_no);
						sb.append("</C_PROD_NO>");
					}
				}
				if (bpobj.containsKey("c_bsns_typ")) {
					String c_bsns_typ = bpobj.getString("c_bsns_typ");
					if (StringUtils.isNotEmpty(c_bsns_typ)) {
						sb.append("<C_BSNS_TYP>");
						sb.append(c_bsns_typ);
						sb.append("</C_BSNS_TYP>");
					}
				}
				if (bpobj.containsKey("c_opr_cde")) {
					String c_opr_cde = bpobj.getString("c_opr_cde");
					if (StringUtils.isNotEmpty(c_opr_cde)) {
						sb.append("<C_OPR_CDE>");
						sb.append(c_opr_cde);
						sb.append("</C_OPR_CDE>");
					}
				}
				sb.append("</BASE_PART>");
			}
			
			sb.append("<VEHICLE>");
			
			sb.append("<C_MODEL_CDE>");
			sb.append(c_ref_code2);
			sb.append("</C_MODEL_CDE>");
			
			sb.append("</VEHICLE>");
			sb.append("</BODY>");
		}
		sb.append("</PACKET>");
		resMap.put("reqXml", sb.toString());
		resMap.put("transtype", transtype);
		return resMap;
	}
	
//	public static String getXmlToV7204(ReqParmV7204DTO reqpram,boolean isTpf){
//		Map resMap = new HashMap();
//		StringBuffer sb = new StringBuffer("");
//		sb.append("<?xml version=\"1.0\" encoding=\"GBK\"?>");
//		sb.append("<PACKET type=\"REQUEST\" version=\"1.0\">");
//		String transtype = "V7204";
//		sb.append("<HEAD>");
//		sb.append("<TRANS_TYPE>");
//		sb.append(transtype);
//		sb.append("</TRANS_TYPE>");
//		sb.append("<SERIALDECIMAL>");
//		if(isTpf){
//			sb.append(reqpram.getC_order_no_tpf());
//		}else{
//			sb.append(reqpram.getC_order_no_biz());
//		}
//		sb.append("</SERIALDECIMAL>");
//		
//		sb.append("<USER>");
//		sb.append(reqpram.getUser());
//		sb.append("</USER>");
//		
//		sb.append("<PASSWORD>");
//		sb.append(reqpram.getPassword());
//		sb.append("</PASSWORD>");
//		sb.append("</HEAD>");
//		
//		sb.append("<BODY>");
//		sb.append("<BASE_PART>");
//		sb.append("<C_APP_NO>");
//		if(isTpf){
//			sb.append(reqpram.getC_app_no_tpf());
//		}else{
//			sb.append(reqpram.getC_app_no_biz());
//		}
//		sb.append("</C_APP_NO>");
//		
//		sb.append("<C_PROD_NO>");
//		if(isTpf){
//			sb.append(reqpram.getC_prod_no_tpf());
//		}else{
//			sb.append(reqpram.getC_prod_no_biz());
//		}
//		sb.append("</C_PROD_NO>");
//		sb.append("<C_DPT_CDE>");
//		sb.append(reqpram.getC_dpt_cde());
//		sb.append("</C_DPT_CDE>");
//		sb.append("<C_NEW_BSNS_TYP>");
//		sb.append(reqpram.getC_new_bsns_typ());
//		sb.append("</C_NEW_BSNS_TYP>");
//		sb.append("<C_OPR_CDE>");
//		sb.append(reqpram.getC_opr_cde());
//		sb.append("</C_OPR_CDE>");
//		sb.append("<C_SYSTEM_FLAG>");
//		sb.append(reqpram.getC_system_flag());
//		sb.append("</C_SYSTEM_FLAG>");
//		//2017年7月21日14:05:31新增字段   1 是否第三方平台    C_THIRD_BUSSINESS 1：是0：否  2 提核意见	C_UNDR_MRK
//		sb.append("<C_THIRD_BUSSINESS>");
//		sb.append("0");
//		sb.append("</C_THIRD_BUSSINESS>");
//		sb.append("<C_UNDR_MRK>");
//		sb.append("</C_UNDR_MRK>");
//		sb.append("</BASE_PART>");
//		sb.append("</BODY>");
//		sb.append("</PACKET>");
//		return sb.toString();
//	}
	
	//获得税目
	public static String getTaxItemCode(String cucde,String cvtyp,String nllperson, String ndisplacement){
		String c_tax_item_cde = StringUtils.EMPTY;
		//车辆性质 c_usage_cde  车辆类型 c_vhl_typ  核定载客数 n_limit_load_person  排量 n_displacement
		int nllpersonint  = 1;
		if(StringUtils.isNotEmpty(nllperson)){
			nllpersonint = Integer.parseInt(nllperson);
		}
		int ndisplacementint = 0;
		if(StringUtils.isNotEmpty(ndisplacement)){
			ndisplacementint = (int) Double.parseDouble(ndisplacement);
		}
		if("309001".equals(cucde) || "309002".equals(cucde)||"309004".equals(cucde)||"309012".equals(cucde)
				||"309016".equals(cucde)||"309017".equals(cucde)||"309018".equals(cucde)){
			if(nllpersonint <= 9){//座位数<=9
				if(ndisplacementint >0 && ndisplacementint <=1000 ){//排气量>0 且 <=1000
					c_tax_item_cde = "398013";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398013", "乘用车9人（含）以下排量1.0升（含）以下的"]);//398013
				}else if(ndisplacementint >1000 && ndisplacementint <=1600 ){//排气量>1000 且 <=1600
					c_tax_item_cde = "398014";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398014", "乘用车9人（含）以下排量1.0升以上至1.6升（含）的"]);//398014
				}else if(ndisplacementint >1600 && ndisplacementint <=2000 ){//排气量>1600 且 <=2000
					c_tax_item_cde = "398015";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398015", "乘用车9人（含）以下排量1.6升以上至2.0升（含）的"]);//398015
				}else if(ndisplacementint >2000 && ndisplacementint <=2500 ){//排气量>2000 且 <=2500
					c_tax_item_cde = "398016";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398016", "乘用车9人（含）以下排量2.0升以上至2.5升（含）的"]);//398016
				}else if(ndisplacementint >2500 && ndisplacementint <=3000 ){//排气量>2500 且 <=3000
					c_tax_item_cde = "398017";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398017", "乘用车9人（含）以下排量2.5升以上至3.0升（含）的"]);//398017
				}else if(ndisplacementint >3000 && ndisplacementint <=4000 ){//排气量>3000 且 <=4000
					c_tax_item_cde = "398018";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398018", "乘用车9人（含）以下排量3.0升以上至4.0升（含）的"]);//398018
				}else if(ndisplacementint >4000){//排气量>4000
					c_tax_item_cde = "398019";
					//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398019", "乘用车9人（含）以下排量4.0升以上的"]);//398019
				}
			}else if(nllpersonint > 9 && nllpersonint < 20){//座位数>9且<20
				c_tax_item_cde = "398020";
				//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398020", "商用车9人以上20人以下的中型客车及电车"]);//398020
			}else if(nllpersonint >= 20){
				c_tax_item_cde = "398021";
				//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398021", "商用车20人以上(含)的大型客车及电车"]);//398021
			}
		//摩托车
		}else if("309008".equals(cucde)||"301006001".equals(cucde)){
			if(cvtyp=="302004005"){//50CC及以下免税
				c_tax_item_cde = "";
				//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["", ""]);//置空
			}else{
				c_tax_item_cde = "398028";
				//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398028", "50cc以上摩托车"]);//3980282
			}
		//&拖拉机
		}else if("309009".equals(cucde)||"301006002".equals(cucde)){//拖拉机免税
			c_tax_item_cde = "";
			//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["", ""]);//置空
			
		//非营业货车、营业货车
		}else if(("309014".equals(cucde)||"309015".equals(cucde))){
			if("302002016".equals(cvtyp)){
				//低速载货汽车和三轮汽车不对应数目
				c_tax_item_cde = "";
			}else{
				c_tax_item_cde = "398022";
				//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398022", "货车"]);//398022
			}
		//非营业挂车、营业挂车
		}else if("309035".equals(cucde)||"309036".equals(cucde)){
			c_tax_item_cde = "398025";
			//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde",["398025", "挂车"]);//398025
		}else{
			c_tax_item_cde = "";
			//issTool.setAttrValue(dw["VsTax"],"VsTax.CTaxItemCde","")//特种车挂车和特种车不对应税目
		}
		return c_tax_item_cde;
	}
	
}