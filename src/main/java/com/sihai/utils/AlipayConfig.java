package com.sihai.utils;

public class AlipayConfig {

	public static String app_id = "2021000118612683";//�ں�̨��ȡ���������ã�
	
	public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCVyW64aND0mUOV4XWo2eJTXu+hwKSnMNhjKgsLMUUXPCZDXUew+Wjvd583pU5Q4tO5fZgXnSmyE99ZkMJNb1JhehanXPvj/dwGt3JSzPatXo9SeaPmjjq8NaQRalafrge6Zyul3eoNBKQF1ETWVd+j/ETpd1sdB4Tz1Nl7EknQVwPEog89oL59kywkW+mV/C1TtFGcrvTlZXYDnHjp9JxAcRO2imbl+CI/FxX93NkqEcexiIcagBguam3SGQjc8VmTdXBovVSCdRq4mJPKnD4+taGZRDxXmk3+AZzCmjchnaR9udBp3OANrm3a+oAmipWkZfCTunQ3h65G1JoI88GnAgMBAAECggEARSkAynz7HjU2E5pKbXBNJBmNo64DWH8hKohbGQviztui/y+uznQak5c0GMlm48oX4GmxNBYJDoRGeGBylrZz3zY0B4rTc23fjepeCwVAUMR8gKRRnT7Gt+g8nR3waUI9pz/D044nZ2NhKJ/eOOjlnh3446OMmlbCeKMq17yWAG+3kNXvisWJ/+eDU71djIbvxf8WK8ahz+uTZJftyrKG2CcHRoonpI0rFyNm6NBkASV1qEJ+xVj84TC+bFS54HkwfaImj3Cqru8gvIHbnbXOll0NYjYih4OlQ8obx26b9J+uZlAezbDXV+goJkD63h7K1Nvv4ncP76orkaMJcYVOgQKBgQDUGvaE0NgGIEKkilBEaQshrjRBG+c4U2Z6kcqnnu2jODgT6zD6BWQx2TYxHpNK/ypJtuVSRzkaRzoEAzh8y8knJrumk53/ZJjWx8XUs05ghPDMTpw+rjI8MmoBnk3U0dcUFA5H1XKzxiVwv6IpPFxVz3CRkOg1GqV4QqU37+AQVwKBgQC0yOzzSg4V9DHPNq9rkFNh1EbflHfk/NE8e9eM2KUpd+mu1e3c92m+WI7qhYynOuXyEdm7Gp07M+yz3/k7UIN0l4t+WxFfVveTvRf7bnbPYEPWR3q05EUSgr1otQMXdsMwOPPxGKon37fSpqevWLAv5WpIQAv9vp8Lg87HEmvHMQKBgEMQq3XfWw7E0I2aNjsLQ7vIizkzC28h37tNsdhCRj1fn0udCAVmAwJH/fyWAFisScC5FdVoM8P9VXjDU+8RuG6qrpbDAigotLLkw8a3U0btgf33tSuUhMnH3wDX/yAVoX31wXYxJW12b4ww66NCNKflSWCdgu6XmE5oNDl1nVFNAoGAJCq6NKXREZVLza+cAoHaHI0yLJJwNfBaD6aa5cOFrzkdF+wWbQlWL01aMhLLo70FuZrWmzbk0648oXOiUbp2wgF7V6jyXcdxOi4vOQ7NWAljKOAd7UhphR2AtQzZdH0+6UvLiaUsjVOVW+AZVdwBS2OzEoc1nureuJgC6xKFW1ECgYEAknrQYwtfAT9nSvtgSCpGLyNfjmhfuTgQ0IBUofgoXXHzgH0t7QENxiCTI78bs997wjji2otjYF8jDq2si1jn4+DFnctefbJAF5vo2YxfC8Lp9hXHxClW/7KPLdG0X6h4tcYm4l/sQO90J9cPToZQPlQl154TjGaJCIN2JipJbqA=";//�̻�˽Կ������PKCS8��ʽRSA2˽Կ���̳̲鿴��ȡ��ʽ���������ã�

	public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoYWzNEftbPLiav47oZaZEi3TBVosvIB0vrJTv1MxxCQl5zp3EaC7I3fhQV3VgB+XH1bCtPF0AF4G7wZGhKyLLRhehmuucf/du04WuzmOAdbxbI4PHMUoZDOpmJhL3MhWk0Twq19ZoyU0cQnD6RrPYWNv5EhS1f/UulK7U4+ond8kJCexBJVOCp9F4jEvIi9ugFAn7p0PcDsvY46xdcgKDZnPF6GSvCP5/aQc/HGxjHayq1s5ScFc2M/3SzGl08rcqDvBozq6U3ICvTUOrxK9DOGWHErC28apa2tRYT5NQQLX99AHla+H9cs06/RC9gl3Fih06EIcOKTbWiX/favNDwIDAQAB";//֧������Կ���̳̲鿴��ȡ��ʽ���������ã�
	
	public static String notify_url = "http://localhost:8080/alipay/alipayNotifyNotice.action";
	
	public static String return_url = "http://localhost:8080/alipay/alipayReturnNotice.action";
	
	public static String sign_type = "RSA2";
	
	public static String charset = "utf-8";
	
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";//ע�⣺ɳ����Ի�������ʽ����Ϊ��https://openapi.alipay.com/gateway.do
}
