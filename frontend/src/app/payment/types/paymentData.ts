export type PaymentData = {
  id: number;
  amount: number;
  optionType: string;
  optionName: string;
};
export type PaymentHistoryItem = {
  id: number;
  purchaseId: number;
  paymentOptionType: string;
  paymentOptionName: string;
  paymentInfo: string | null;
  amount: number;
  paymentStatus: "PENDING" | "SUCCESS" | "FAILED" | "CANCELLED";
  date: string;
};