package contagiouscode.mirsengar.debtdo.ui.invoicedetail.components

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import contagiouscode.mirsengar.debtdo.model.Address

@Composable
fun Address(address : Address) {
     Text(
               text = address.street ,
               style = MaterialTheme.typography.caption ,
               color = MaterialTheme.colors.onBackground ,
     )
     Text(
               text = address.city ,
               style = MaterialTheme.typography.caption ,
               color = MaterialTheme.colors.onBackground ,
     )
     Text(
               text = address.postCode ,
               style = MaterialTheme.typography.caption ,
               color = MaterialTheme.colors.onBackground ,
     )
     Text(
               text = address.country ,
               style = MaterialTheme.typography.caption ,
               color = MaterialTheme.colors.onBackground ,
     )
}